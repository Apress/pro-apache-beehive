<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>
     <netui:html>
<link rel="stylesheet" type="text/css" href="../../../../resources/beehive/version1/css/main.jsp" />
<head>
<title>My Beehive Library</title>
</head>
<body>
<table border="0" cellpadding="6" cellspacing="0">
  <tr><td ><span class="promo">
  <netui:anchor action="showAddBookPage" styleClass="text" > Add Book </netui:anchor><br>
  <netui:anchor action="showSearchBookPage" styleClass="text" > Search Book</netui:anchor><br>
  </span>
  </td></tr>
</table>
</body>
</netui:html>