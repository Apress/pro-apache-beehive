<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui" %>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="temp" %>

<temp:template templatePage="/demo/DemoHeader.jsp">
  <temp:setAttribute name="title" value="Demo" />
  <temp:setAttribute name="pageTitle" value="New Hire Wizard - Name" />
  <temp:section name="wizBody">

<!-- The contents of the form -->
<netui:form action="/DemoSubmit">
<tr>
  <td class="wizbody" colspan="3">Enter new hire's name, or "animals" to list some animals:</td>
</tr>
<tr>
  <td class="wizbody" rowspan="2"><img src="images/_.gif" height="75" width="1"></td>
  <td class="wizbody">Name</td>
  <td class="wizbody"><netui:textBox dataSource="actionForm.name" />
</tr>
<tr>
  <td class="wizbodyright" colspan="3" ><hr>
    <netui:button type="submit">Next</netui:button>
  </td>
</netui:form>

  </temp:section>
</temp:template>
