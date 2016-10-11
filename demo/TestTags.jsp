<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui" %>
<%@ taglib prefix="netui-data" uri="http://beehive.apache.org/netui/tags-databinding-1.0"%> 
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="temp" %>

<netui:form action="/DemoSubmit">
<tr>
  <td colspan="3">This is an Anchor tag </td>
</tr>
<tr>
  <td rowspan="2"><img src="images/_.gif" height="75" width="1"></td>
  <td>Name</td>
  <td> <netui:anchor action="
  <td><netui:textBox dataSource="actionForm.name" />
</tr>
<tr>
  <td class="wizbodyright" colspan="3" ><hr>
    <netui:button type="submit">Next</netui:button>
  </td>
</netui:form>