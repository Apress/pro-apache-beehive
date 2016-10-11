<%@ taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>
<html>
<head>
<title>Tree Tag</title>
<netui:base />
</head>
<body bgcolor="#ccffcc">
<%session.setAttribute("myTree","root");
    System.out.println("Session is "+session.getAttribute("mytree"));
    %>
<netui:tree
    dataSource="session.myTree"
    selectionAction="treeState"
    tagId="myTree">
      <netui:treeItem expanded="true" >
          <netui:treeLabel>Root Folder</netui:treeLabel>
          <netui:treeItem expanded="false">
              <netui:treeLabel>I</netui:treeLabel>
              <netui:treeItem expanded="false">
                  <netui:treeLabel>A</netui:treeLabel>
                  <netui:treeItem>1</netui:treeItem>
                  <netui:treeItem>2</netui:treeItem>
              </netui:treeItem>
          </netui:treeItem>
      </netui:treeItem>
  </netui:tree>

<a href="done.do" target="_top" style="font-size:8pt;color:#ff0000;">Back to WebApp Sample Home</a>
</body>
</html>