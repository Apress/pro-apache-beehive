<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui" %>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="temp" %>
<html>
<head>
<title><temp:attribute name="title"/></title>
<link rel="stylesheet" href="/demo/default.css" type="text/css" />
<netui:base />
</head>
<body>
<h1><img border="0" src="images/beehive_large.gif" width="64" height="64"> Pollinate Milestone 1 - page flow demo</h1>
<p>Welcome to Pollinate M1.<br>
This is a simple Apache Beehive NetUI page flow demonstration.</p>
<table width="300" class="wiztable">
  <tr>
    <td class="wizhead" colspan="3"><b><temp:attribute name="pageTitle"/></b></td>
  </tr>
  <tr>
    <temp:includeSection name="wizBody"/>
  </tr>
</table>
</body>
</html>
