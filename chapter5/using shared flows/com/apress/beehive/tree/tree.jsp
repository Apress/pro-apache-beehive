<%@ taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>
<html>
<head>
<title>Tree Tag</title>
<netui:base />
</head>
<body bgcolor="#ccffcc">
 <netui:tree tagId="mytree" dataSource="pageFlow.myTree"  imageRoot="treeImages" expansionAction="treeState"   selectionAction="treeState">

       <netui:treeItem title="Root Folder" expanded="true" action="treeState" target="contentFrame">
        <netui:treeLabel>Root Folder</netui:treeLabel>
          <netui:treeItem title="I"  action="treeState" target="contentFrame">
              <netui:treeLabel>I</netui:treeLabel>

                <netui:treeItem title="A"  action="treeState" target="contentFrame">
                    <netui:treeLabel>A</netui:treeLabel>
                    <netui:treeItem title="1" action="treeState" target="contentFrame">
                     <netui:treeLabel>1</netui:treeLabel>
                      </netui:treeItem>
                    <netui:treeItem title="2" action="treeState" target="contentFrame">
                     <netui:treeLabel>2</netui:treeLabel>
                     </netui:treeItem>
                </netui:treeItem>

                <netui:treeItem title="B"  action="treeState" target="contentFrame">
                   <netui:treeLabel>B</netui:treeLabel>
                   <netui:treeItem title="1" action="treeState" target="contentFrame">
                     <netui:treeLabel>1</netui:treeLabel>
                      </netui:treeItem>
                    <netui:treeItem title="2" action="treeState" target="contentFrame">
                     <netui:treeLabel>2</netui:treeLabel>
                     </netui:treeItem>
                </netui:treeItem>

                <netui:treeItem title="C"  action="treeState" target="contentFrame">
                <netui:treeLabel>C</netui:treeLabel>
                    <netui:treeItem title="1" action="treeState" target="contentFrame">
                     <netui:treeLabel>1</netui:treeLabel>
                      </netui:treeItem>
                    <netui:treeItem title="2" action="treeState" target="contentFrame">
                     <netui:treeLabel>2</netui:treeLabel>
                     </netui:treeItem>
                </netui:treeItem>

            </netui:treeItem>

        </netui:treeItem>
    </netui:tree>
<hr/>
<a href="done.do" target="_top" style="font-size:8pt;color:#ff0000;">Back to WebApp Sample Home</a>
</body>
</html>