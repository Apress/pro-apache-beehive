<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui" %>
<%@ taglib prefix="netui-data" uri="http://beehive.apache.org/netui/tags-databinding-1.0"%> 
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="temp" %>
<head>
<title> anchor tests</title>
<netui:base/>
<script language="javascript">
function test()
{
alert("This is test function");
}
</script>
</head>
<!-- explains netui:body tag -->
<netui:body tagId="name"  text="red" bgcolor="black" title="Tip String" alink="yellow" vlink="blue" link="pink" onLoad="alert('hi');" onUnload="alert('Bye');">
<netui:form action="DemoSubmit" tagId ="form1">
<table border="0" cellpadding="6" cellspacing="0">
<tr>

<td> <netui:anchor tagId="link1" action="submitAnchor"> simple anchor </netui:anchor>with just an action atrribute</td>

</tr>

<tr>
<td> <netui:anchor tagId="link2" formSubmit="true">anchor </netui:anchor> with action and formSubmit set as true</td>

</tr>

<tr>
<td> <netui:anchor  href="javascript:test();" accessKey="t">anchor </netui:anchor>with action and location</td>

</tr>

<tr>
<td> <netui:anchor  href="www.yahoo.com" target="_blank" >anchor </netui:anchor>with target attribute</td>

</tr>

<tr>
<td> <netui:anchor  action="submitAnchor" title="text tip">anchor </netui:anchor>with target attribute 
</td>

</tr>

</table>
<netui:span tagId="span1" title="span tip" value=""/>

</netui:form>
</netui:body>