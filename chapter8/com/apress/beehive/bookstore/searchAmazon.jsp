<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>
<netui-template:template templatePage="librarytemplate.jsp">
    <netui-template:section name="body">
    <netui:form action="searchAWS" tagId="amazonSearch" genJavaScriptFormSubmit="true">
        <table border="0" cellpadding="3" cellspacing="0" width="100%" >
	  	<tr><td class="corpsubhead"><span class="promo"><B>Search Books</b></span></td></tr>
	  	<tr><td colspan="2" class="promo">


	  	<table border="0" cellpadding="2" cellspacing="0">
	  			<tr class="odd" valign="top">
				<td  class="text" align="right"><b> ISBN  : </b></td>
				<td class="text" ><netui:textBox tagId="isbn" dataSource="actionForm.isbn" size="20" styleClass="text"/>
                example :1590595157</td>
</tr>
	  		<TR>

	  		<td><netui:button action="searchAWS" type="submit" styleClass="text" > Search Amazon</netui:button> </td>

	  	</tr></table>

	  	</td></tr>
  </table>
  <BR><BR>
  <netui:anchor action="begin" styleClass="text" >Back To Menu </netui:anchor>
  </netui:form>
              </netui-template:section >
              </netui-template:template>
