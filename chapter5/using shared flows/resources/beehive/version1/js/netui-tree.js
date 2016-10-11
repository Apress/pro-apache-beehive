// The variable netUI already exists and the type NetUI has been
// defined.  There isn't anything in it at the moment.
// NOTE: Using this file requires that runAtClient be turned on in the
//      script container.

///////////////////////////////// NetUI //////////////////////////

// define the constructor for the NetUI object
function NetUI() {
   this.members = new Object();    // the named object
}

// create the variable, it will be empty
var netUI = new NetUI();

NetUI.prototype.action = function(command)
{
    var f = new Function("members","members." + command);
    f(this.members);
    return false;
}

NetUI.prototype.xmlHttpRequestMapping = ".xhr";


///////////////////////////////// Tree //////////////////////////
function NetUITree()
{
}

// this method walks the document looking for tree items that
// are collapsed.  A non-leaf tree item is defined here as an anchor
// that has an attribute that defines either the collapse/expand state
NetUITree.prototype.init = function()
{
    for (var i=0;i<document.links.length;i++) {
	var attr = netUIGetAttribute(document.links[i],"netui","treeAnchor");
        if (attr != null) {
            var isInit = netUIGetAttribute(document.links[i],"netui","treeAnchorInit");
	    if (isInit != null && isInit != "") {
		var link = document.links[i];
		var treeName = netUI.netUITree.getTreeName(link);
		//alert("TreeName:" + treeName);
		if (netUI.netUITree.trees[treeName] != null) {
                    document.links[i].onclick = NetUICollapseTree;
		    if (attr == "collapse") {
		       NetUICollapseTreeNode(document.links[i],false);
		    }
	            document.links[i].removeAttribute("netui:treeAnchorInit");
		}
            }
        }
    }
}

// Given a node inside the tree, this method will find the name
// of the tree and return it.  It should only be with an anchor
// tree inside of the generated tree and will reportError if the
// tree is invalid.
NetUITree.prototype.getTreeName = function(node)
{
    //alert("A:" + node.nodeName);
    if (node.nodeName != "A")
        return reportNetUIError("getTreeName: Expected Node was not an A:" + node.nodeName);

    // parent of the A should be a DIV
    node = node.parentNode;
    //alert("DIV:" + node.nodeName);
    if (node.nodeName != "DIV")
        return reportNetUIError("getTreeName: Expected Node was not an DIV:" + node.nodeName);

    // parent of the DIV is the root of the tree DIV
    node = node.parentNode;
    //alert("DIV:" + node.nodeName);
    if (node.nodeName != "DIV")
        return reportNetUIError("getTreeName: Expected Node was not an DIV:" + node.nodeName);

    var attr = netUIGetAttribute(node,"netui","treeName");
    if (attr == null)
	return reportNetUIError("getTreeName: The treeName was not found");

    return attr;
}

// This method will create a command URL.  
// @param command this is the command name, it is a simple String
// @param treeName this name of the tree
// @param nodeName this is the node to apply the command to
NetUITree.prototype.getTreeCommandUrl = function(command,treeName,nodeName,expandOnServer)
{
    var url = netUI.webAppName + "/" + command + NetUI.prototype.xmlHttpRequestMapping +
        "?tree=" + treeName + "&node=" + nodeName;
    if (expandOnServer == "true") {
	url = url + "&expandOnServer=true";
    }
    return url;
}

// This method will raise a command through XmlHttpRequest and send it to
// the server.  The command must be a fully formed URL including all of the 
// parameters.
// @param cmdUrl the fully specified URL representing the command to the servere
NetUI.prototype.raiseCommand = function(cmdUrl,callback)
{
    var req = null;
    var func = function() {
       if (req.readyState==4) {
	   if (req.status == 200) {
	       if (req.responseXML!=null && callback != null) {
		   callback(req);
	       }
	   }
	   else {
	       reportNetUIError("Unable to retrieve XML data:" +  req.statusText);
	   }
       }
    }

    if (window.XMLHttpRequest) {
        // Moz/Firefox
        req = new XMLHttpRequest();
        req.onreadystatechange=func;
        req.open("GET", cmdUrl, true);
        req.send(null);

    } else if (window.ActiveXObject) {
        // IE
        req = new ActiveXObject("Microsoft.XMLHTTP");
        if (req) {
            req.onreadystatechange=func;
            req.open("GET", cmdUrl, true);
            req.send(null);
        }
    }
}

function getCData(node)
{
    for (var i=0;i<node.childNodes.length;i++) {
	if (node.childNodes[i].nodeType == 4)
	    return node.childNodes[i];
    }
    return null;
}

// If the XmlHttpRequest results in a valid XML document, this will be called
function NetUITreeXmlHttpRequestReturn(req)
{
   var nodeName = req.responseXML.getElementsByTagName("node");
   if (nodeName == null || nodeName.length == 0)
       return;

   var treeDivs = req.responseXML.getElementsByTagName("treeDiv");


   nodeName = nodeName[0].childNodes[0].nodeValue;

   for (var i=0;i<document.links.length;i++) {
       var attr = netUIGetAttribute(document.links[i],"netui","treeId");
       if (attr != null) {
	   if (attr == nodeName) {
	       var dump = "DUMP:\n";
	       var treeNode = document.links[i];
	       treeNode.removeAttribute("netui:expandOnServer");
	       treeNode = treeNode.parentNode;
	       for (var j=0;j<treeDivs.length;j++) {
		   var txt = getCData(treeDivs[j]);
                   //alert("Text:" + txt.nodeValue);
		   if (txt == null) {
		       reportNetUIError("Didn't find the CDATA");
		       return;
		   }
	       
		   var pElement = document.createElement("div");
		   if (treeNode.nextSibling != null) {
		       var sib = treeNode.nextSibling;
		       pElement.innerHTML=txt.nodeValue;
		       var newNode = pElement.childNodes[0];
		       treeNode.parentNode.insertBefore(newNode,sib);
		       treeNode = newNode;
		       //alert(dumpNodes(dump,pElement,0));
		   }
		   else {
		       pElement.innerHTML=txt.nodeValue;
		       var newNode = pElement.childNodes[0];
		       treeNode.parentNode.appendChild(newNode);
		       treeNode = newNode;
		   }
	       }
	       netUI.netUITree.init();
	   }
       }
   }
}

function dumpNodes(results, node, level)
{
    for (var i=0;i<level;i++) {
	results = results + " ";
    }
    results = results + node + "\n";
  
    for (var i=0;i<node.childNodes.length;i++)
        results = dumpNodes(results,node.childNodes[i],level+1);
    return results
}

function NetUIExpandTree()
{
    // make sure that what is calling this is an anchor
    if (this.nodeName != "A")
        return reportNetUIError("NetUIExpandTree: Expected Node was not an A:" + this.nodeName);

    // Create the XmlHttpRequest that will inform the server of the 
    // change in the client state.
    var treeName = netUI.netUITree.getTreeName(this);
    var nodeName = netUIGetAttribute(this,"netui","treeId");
    var expandOnServer = netUIGetAttribute(this,"netui","expandOnServer");
    var expandPath = netUIGetAttribute(this,"netui","expandPath");
    var cmd = "treeExpand";
    if (expandPath != null) {
	cmd = expandPath + "/" + cmd;
    }
    var url = netUI.netUITree.getTreeCommandUrl(cmd,treeName,nodeName,expandOnServer);
    netUI.raiseCommand(url,NetUITreeXmlHttpRequestReturn);

    // find the image child so we can change the image
    var children = this.childNodes;
    var img = null;
    for (var i=0;i<children.length;i++) {
        if (children[i].nodeName == "IMG") {
            img = children[i];
            break;
        }
    }
    if (img == null)
        return reportNetUIError("IMG tag not found");

    var nodeName = netUIGetAttribute(this,"netui","expandLast");
    var expandImage = netUIGetAttribute(this,"netui","imageExpand");
    if (expandImage != null) {
	img.src = expandImage;
    }
    else {
	if (nodeName != null)
	    img.src = netUI.netUITree.trees[treeName].imgCollapseLastName;
	else
	    img.src = netUI.netUITree.trees[treeName].imgCollapseName;
    }
    this.onclick = NetUICollapseTree;

    // go up the level and get the Div
    var parentDiv = this.parentNode;
    if (parentDiv.nodeName != "DIV")
        return reportNetUIError("Expected Node was not an DIV:" + parentDiv.nodeName);

    var depth = netUI.netUITree.getDepth(parentDiv);
    parentDiv.setAttribute("netui:treeAnchor","expand");
    parentDiv = parentDiv.nextSibling;
    while (parentDiv != null && parentDiv.nodeName != "DIV") {
        parentDiv = parentDiv.nextSibling;
    }
    if (parentDiv == null) {
        return false;
    }

    netUI.netUITree.expandTreeSection(depth,parentDiv);
    return false;
}

// this will cause a collapse to happend in the tree
// this function is not name spaced because it is 
function NetUICollapseTree()
{
    if (this.nodeName != "A")
        return reportNetUIError("NetUICollapseTree: Expected Node was not an A:" + this.nodeName);
    return NetUICollapseTreeNode(this,true);
}

// this will cause a collapse to happend in the tree
// this function is not name spaced because it is 
function NetUICollapseTreeNode(node,raiseCommand)
{
    // verify we are inside an anchor
    if (node.nodeName != "A")
        return reportNetUIError("NetUICollapseTreeNode: Expected Node was not an A:" + node.nodeName);

    // Create the XmlHttpRequest that will inform the server of the 
    // change in the client state.
    var treeName = netUI.netUITree.getTreeName(node);
    if (raiseCommand) {
       var nodeName = netUIGetAttribute(node,"netui","treeId");
       var url = netUI.netUITree.getTreeCommandUrl("treeCollapse",treeName,nodeName,"false");
       netUI.raiseCommand(url,NetUITreeXmlHttpRequestReturn);
    }

    var children = node.childNodes;
    var img = null;
    for (var i=0;i<children.length;i++) {
        if (children[i].nodeName == "IMG") {
            img = children[i];
            break;
        }
    }
    if (img == null)
        return reportNetUIError("IMG tag not found");

    // set the image to be the collapse image
    var nodeName = netUIGetAttribute(node,"netui","expandLast");
    var expandImage = netUIGetAttribute(node,"netui","imageCollapse");
    if (expandImage != null) {
	img.src = expandImage;
    }
    else {
	if (nodeName != null)
	    img.src = netUI.netUITree.trees[treeName].imgExpandLastName;
	else
	    img.src = netUI.netUITree.trees[treeName].imgExpandName;
    }
    node.onclick = NetUIExpandTree;

    // go up the level
    var parentDiv = node.parentNode;
    if (parentDiv.nodeName != "DIV")
        return reportNetUIError("Expected Node was not a DIV:" + parentDiv.nodeName);

    // get the depth and then begin to collapse rows
    var depth = netUI.netUITree.getDepth(parentDiv);
    parentDiv.setAttribute("netui:treeAnchor","collapse");
    netUI.netUITree.collapseTreeSection(depth,parentDiv.nextSibling);
    
    // change the method the 
   return false;
}

// Look above this node to find a Parent node that is a <tr>
NetUITree.prototype.getDiv = function(a)
{
    var parentDiv = a.parentNode;
    if (parentDiv.nodeName != "DIV")
        return reportNetUIError("Exception Node was not a DIV:" + parentDiv.nodeName);
    return parentDiv;
}

// This will return the <TD> that contains the colspan attribute,
// it will always return a TD or null.
NetUITree.prototype.getDepth = function(div)
{
    if (div.nodeName != "DIV")
        return reportNetUIError("getDepth only support DIV nodes, found: " + div.nodeName);
    
    var attr = netUIGetAttribute(div,"netui","treeLevel");
    return attr;
}

// This will collapse a set of rows
NetUITree.prototype.collapseTreeSection = function(depth,div)
{
    // convert the depth into an integer...
    depth = parseInt(depth);

    // now we walk the rows collapsing 
    while (div != null) {
        if (div.nodeName != "DIV") {
            if (div.nodeType != 1) {
                div = div.nextSibling;
                continue;
            }
            break;
        }
        
        // @todo: need to verify that the div is inside the tree or not
        // do we just get to the end if we only walk siblings?
        
        // Get the colspan so we can see the indent level.  
        var csp = this.getDepth(div);
        csp = parseInt(csp);

        // if the colSpan is less than the collapse colspan set the
        // the display of the div to none.
        if (csp > depth) {
            div.style.display = "none";
        }
        if (csp <= depth)
            break;
        div = div.nextSibling;
    }
}

NetUITree.prototype.expandTreeSection = function(depth,div)
{
    //alert("ExpandTreeSection:" + div);
    depth = parseInt(depth);
    
    // Find the next div after the node we are expanding...
    while (div != null && div.nodeName != "DIV") {
        div = div.nextSibling;
    }
    if (div == null) {
        return false;
    }

    while (div != null) {
        div = this.expandTree(depth+1,div);
        if (div == null)
           return false;
        var csp = this.getDepth(div);
        csp = parseInt(csp);
        if (csp <= depth)
           return false;
    }
    return false;
}

NetUITree.prototype.expandTree = function(depth,div)
{
    if (div.nodeName != "DIV")
        return reportNetUIError("expandTree only support DIV nodes, found: " + div.nodeName);
        
    //alert("inside expand:" + depth);
    while (true) {
        div.style.display = "";

        var at = netUIGetAttribute(div,"netui","treeAnchor");

        // get the next sibling
        div = div.nextSibling;
        while (div != null && div.nodeName != "DIV") {
            div = div.nextSibling;
        }
        if (div == null)
            return null;

        // see what depth it is...
        // if the depth is the same then we continue expanding it..
        var csp = this.getDepth(div);
        csp = parseInt(csp);
        //alert("csp:" + csp + " attr:" + at);
        if (csp == depth)
           continue;

        // if this is less than depth return it to the previous level
        if (csp < depth)
           return div;
        
        // if the attribute is not set, then we need to expand the subtree
        if (at == null || at == "expand") {
            div = this.expandTree(csp,div);
            if (div == null)
                return div;
            csp = this.getDepth(div);
            csp = parseInt(csp);
            if (csp < depth)
                return div;
        }
        else {
            //alert("inside collapsed region");
            while (true) {
                while (div != null && div.nodeName != "DIV") {
                    div = div.nextSibling;
                }
                if (div == null)
                    return null;

                csp = this.getDepth(div);
                csp = parseInt(csp);
                if (csp <= depth)
                    break;
                div = div.nextSibling;
            }
            if (csp < depth)
                return div;
        }
    }
}

///////////////////////////////// DivPanel //////////////////////////

// This is a DivPaneContainer
function NetUIDivPanelInstance()
{
    this.pages = new Object();
    this.curPage = null;
    this.pageName = null;
    this.divPanelName = null;
}

NetUIDivPanelInstance.prototype.showPage = function(page)
{
    if (this.divPanelName != null) {
       var url = netUI.netUIDivPanel.getCommandUrl("switchPage",this.divPanelName,page);
       netUI.raiseCommand(url,NetUIDivPanelXmlHttpRequestReturn);
    }

    var newPage = this.pages[page];
    if (newPage != null) {
       this.curPage.style.display = "none";
       this.curPage = newPage;
       this.curPage.style.display = "";
       this.pageName = page;
    }
}

// panels -- this is a hash of all the panels defined.  It is a mapping from ID to panel
function NetUIDivPanel()
{
    this.panels = new Object();
}

// This method will create a command URL.  
// @param command this is the command name, it is a simple String
// @param treeName this name of the tree
// @param nodeName this is the node to apply the command to
NetUIDivPanel.prototype.getCommandUrl = function(command,divPanelName, firstPage)
{
    var url = netUI.webAppName + "/" + command + NetUI.prototype.xmlHttpRequestMapping +
       "?divPanel=" + divPanelName + "&firstPage=" + firstPage;
    return url;
}

// The initialization routine will walk all the div's looking
// for DivPanels.
NetUIDivPanel.prototype.init = function()
{
    this.loadDivPanels(document);
}

// This method will call the individual panel to showPage a page
NetUIDivPanel.prototype.showPage = function(panel,page)
{
    this.panels[panel].showPage(page);
}

// This method will walk the DOM looking for a netui-div-panel attribute
// it then takes the DivPanel and inserts into the object
NetUIDivPanel.prototype.loadDivPanels = function(node)
{
    if (node.nodeType == 1 || node.nodeType == 9) {
        if (node.nodeType == 1 && node.nodeName == "DIV") {
            var attr = node.getAttribute("netui-div-panel");
            if (attr != null) {
                //alert("here:" + node.id);
		attr = node.getAttribute("netui:divName");
                var dp = new NetUIDivPanelInstance();
		dp.divPanelName = attr;
                netUI.members[node.id] = dp;
                this.panels[node.id] = dp;
                this.createDivPanel(node,dp);

                attr = node.getAttribute("netui-div-panel-first");
                if (attr != null) {
                    this.panels[node.id].showPage(attr);
                }

            }
        }
        var children = node.childNodes;
        for (var i=0;i<children.length;i++) {
            this.loadDivPanels(children[i]);
        }
    }
}

// This method will create the initial runtime view of the
// divPanel.  The first div is made visible and all others
// are not visible.  It will also initialize the pages variable
// and the curPage variable.
NetUIDivPanel.prototype.createDivPanel = function(node,dp)
{
    var children = node.childNodes;
    var displayFirst = false;
    for (var i=0;i<children.length;i++)  {
        if (children[i].nodeType == 1 && node.nodeName == "DIV")  {
            var divName = children[i].id;
            //alert("Page:" + divName);
            if (divName != null) {
               dp.pages[divName] = children[i];
            }
            if (displayFirst == false) {
                displayFirst = true;
                dp.curPage = children[i];
                continue;
            }
            children[i].style.display = "none";
        }
    }
}

// this will add the tree state to the passed anchor
NetUIDivPanel.prototype.rewriteAnchor = function(node)
{
    var sep = '?';
    if (node.href.indexOf('?') != -1)
        sep = '&';
    var state = "";
    for (var pan in this.panels) {
        state = state + sep;
        state = state + "netui_divpanel_" + pan + "=" + this.panels[pan].pageName;
        sep = '&';
    }

    node.href = node.href + state;
}

function NetUIDivPanelXmlHttpRequestReturn()
{
}

function netUIGetAttribute(node,namespace,attribute)
{
    var attr = node.getAttribute(namespace + ":" + attribute);
    //alert("getAttribute: '" + attr + "'");
    if (attr == null || attr == "") {
	attr = node.getAttribute(attribute);
        //alert("getAttributeNS: '" + attr + "'");
	if (attr == "")
	    attr = null;
    }
    return attr;
}

// Utility function to report an error
function reportNetUIError(msg)
{
    var url = netUI.webAppName + "/netuiError" + NetUI.prototype.xmlHttpRequestMapping +
	"?error=" + msg;
    netUI.raiseCommand(url,null);
    window.status = msg;
    return false;
}
