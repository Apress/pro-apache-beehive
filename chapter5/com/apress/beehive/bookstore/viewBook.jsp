<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>

<netui-template:template templatePage="librarytemplate.jsp">
   <netui-template:section name="body">
 <netui:form action="addBook" tagId="viewBook" genJavaScriptFormSubmit="true">
<table border="0" cellpadding="6" cellspacing="0" class="prefbox" width="100%"><tr><td class="text">

<table border="0" cellpadding="6" cellspacing="0" width="100%">
  <tr class="odd">
  	<td class="text" valign="top" align="right"> Name/Title</td>
  	<td class="text" valign="top"><netui:label value="${actionForm.aBook.title}" /></td>
  	<td class="text" valign="top" align="right">Author</td>
  	<td class="text" valign="top"><netui:label value="${actionForm.aBook.author}" /></td>
  </tr>
  <tr class="even">
  	<td class="text" valign="top" align="right">Type</td>
  	<td class="text" valign="top"><netui:label value="${actionForm.aBook.book_type}" /></td>
  	<td class="text" valign="top" align="right">Publication</td>
  	<td class="text" valign="top"><netui:label value="${actionForm.aBook.publication}" /></td>
  </tr>
  <tr class="odd">
  	<td class="text" valign="top" align="right">Publication Date</td>
  	<td class="text" valign="top"><netui:label value="${actionForm.aBook.publication_Date}" /></td>
  	<td class="text" valign="top" align="right">ISBN</td>
  	<td class="text" valign="top"><netui:label value="${actionForm.aBook.isbn}" /></td>
  </tr>
  <tr class="even">
  	<td class="text" valign="top" align="right">Catalog</td>
  	<td class="text" valign="top"><netui:label value="${actionForm.aBook.catalogNo}" /></td>

  </tr>
    <tr class="odd">
  	<td class="text" valign="top" align="right">Comments</td>
  	<td class="text" valign="top" colspan="3"><netui:label value="${actionForm.aBook.comments}" /></td>
  </tr>
</table>

</td></tr></table><br>
   <netui:anchor action="begin" styleClass="text" >Back To Menu </netui:anchor>

</netui:form>
</netui-template:section >
</netui-template:template>
