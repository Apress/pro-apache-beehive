// The variable netUI already exists and the type NetUI has been
// defined.  There isn't anything in it at the moment.
// NOTE: Using this file requires that runAtClient be turned on in the
//      script container.

///////////////////////////////// NetUI //////////////////////////
NetUI.prototype.action = function(command)
{
    var f = new Function("members","members." + command);
    f(this.members);
    return false;
}


///////////////////////////////// Tree //////////////////////////
function NetUITree()
{
    this.imgExpandName = "/resources/images/handledownlast.gif";
    this.imgCollapseName = "/resources/images/handlerightlast.gif";
}

NetUITree.prototype.init = function()
{
    for (var i=0;i<document.links.length;i++) {
        var attr = document.links[i].getAttribute("netui-tree-anchor");
        if (attr != null) {
             document.links[i].onclick = NetUICollapseTree;
            if (attr == "collapse") {
                NetUICollapseTreeNode(document.links[i]);
            }

        }
    }
}

//  this will run the code necessary to submit an achor
function NetUIAnchorInvoke(node,onclickStuff)
{
    var f = new Function(onclickStuff);
    var ret = f.call(node);
    if (ret != null && ret == false)
        return false;
    netUI.netUITree.rewriteAnchor(node);
}

// this will add the tree state to the passed anchor
NetUITree.prototype.rewriteAnchor = function(node)
{
    var sep = '?';
    if (node.href.indexOf('?') != -1)
        sep = '&';
    var state = "";
    for (var i=0;i<document.links.length;i++) {
        var attr = document.links[i].getAttribute("netui-tree-anchor");
        if (attr != null) {
            var div = this.getDiv(document.links[i]);
            if (!div)
                return reportError("Expected Node was not a DIV:" + node.nodeName);
            var att = div.getAttribute("netui-tree-anchor");
            if (att == null)
                att = attr;

            if (att == "expand") {
                state = state + sep;
                state = state + "tree-state=" +
                    document.links[i].getAttribute("netui-tree-id");
                sep = '&';
            }
        }
    }
    node.href = node.href + state;
}

function NetUIExpandTree()
{
    if (this.nodeName != "A")
        return reportError("Expected Node was not an A:" + node.nodeName);

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
        return reportError("IMG tag not found");
    img.src = netUI.webAppName + netUI.netUITree.imgExpandName;
    this.onclick = NetUICollapseTree;

    // go up the level and get the Div
    var parentDiv = this.parentNode;
    if (parentDiv.nodeName != "DIV")
        return reportError("Expected Node was not an DIV:" + parentDiv.nodeName);

    var depth = netUI.netUITree.getDepth(parentDiv);
    parentDiv.setAttribute("netui-tree-anchor","expand");
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
        return reportError("Expected Node was not an A:" + node.nodeName);
    return NetUICollapseTreeNode(this);
}

// this will cause a collapse to happend in the tree
// this function is not name spaced because it is 
function NetUICollapseTreeNode(node)
{
    if (node.nodeName != "A")
        return reportError("Expected Node was not an A:" + node.nodeName);

    var children = node.childNodes;
    var img = null;
    for (var i=0;i<children.length;i++) {
        if (children[i].nodeName == "IMG") {
            img = children[i];
            break;
        }
    }
    if (img == null)
        return reportError("IMG tag not found");

    // set the image to be the collapse image
    img.src = netUI.webAppName + netUI.netUITree.imgCollapseName;
    node.onclick = NetUIExpandTree;

    // go up the level
    var parentDiv = node.parentNode;
    if (parentDiv.nodeName != "DIV")
        return reportError("Expected Node was not a DIV:" + parentDiv.nodeName);

    // get the depth and then begin to collapse rows
    var depth = netUI.netUITree.getDepth(parentDiv);
    parentDiv.setAttribute("netui-tree-anchor","collapse");
    netUI.netUITree.collapseTreeSection(depth,parentDiv.nextSibling);
    
    // change the method the 
   return false;
}

// Look above this node to find a Parent node that is a <tr>
NetUITree.prototype.getDiv = function(a)
{
    var parentDiv = a.parentNode;
    if (parentDiv.nodeName != "DIV")
        return reportError("Exception Node was not a DIV:" + parentDiv.nodeName);
    return parentDiv;
}

// This will return the <TD> that contains the colspan attribute,
// it will always return a TD or null.
NetUITree.prototype.getDepth = function(div)
{
    if (div.nodeName != "DIV")
        return reportError("getDepth only support DIV nodes, found: " + div.nodeName);
    
    var attr = div.getAttribute("netui-tree-level");
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
        return reportError("expandTree only support DIV nodes, found: " + div.nodeName);
        
    //alert("inside expand:" + depth);
    while (true) {
        div.style.display = "";

        var at = div.getAttribute("netui-tree-anchor");

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
// @Todo: this should be moved?

// This is a DivPaneContainer
function NetUIDivPanelInstance()
{
    this.pages = new Object();
    this.curPage = null;
    this.pageName = null;
}

NetUIDivPanelInstance.prototype.showPage = function(page)
{
    var newPage = this.pages[page];
    if (newPage != null) {
	    this.curPage.style.display = "none";
	    this.curPage = newPage;
	    this.curPage.style.display = "";
            this.pageName = page;
	}
}

// panels -- this is a hash of all the panels defined.  It is a mapping
//      from ID to panel
function NetUIDivPanel()
{
    this.panels = new Object();
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
                var dp = new NetUIDivPanelInstance();
                netUI.members[node.id] = dp;
                this.panels[node.id] = dp;
                this.createDivPanel(node,dp);

                attr = node.getAttribute("netui-div-panel-first");
                if (attr != null) {
                    this.panels[node.id].showPage(attr);
                }
                return;
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

// Utility function to report an error
function reportError(msg)
{
    alert(msg);
    return false;
}
