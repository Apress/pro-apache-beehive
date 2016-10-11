<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>

 <netui-template:template templatePage="librarytemplate.jsp">
    <netui-template:section name="body"> <center>
    <netui:form action="submitForm" tagId="addBookForm" genJavaScriptFormSubmit="true">
    <netui-data:declareBundle bundlePath="apress.beehive.resources.template" name="catalog"/>
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr valign="top">
	<td >${bundle.catalog.addBookTitle} <br>
		Required fields are in <b>bold</b>.</td>
	<td align="right" valign="top"></td>
</tr>
</table><br>

<table border="0" cellpadding="6" cellspacing="0" width="100%">

<tr class="odd" valign="top">
	<td class="text" align="right"><b>Name/Title</b></td>
	<td class="text" ><netui:textBox tagId="name"dataSource="actionForm.aBook.title" size="40" styleClass="text"/>
    <netui:error key="addBook.error.requiredTitle"></netui:error></td>
</tr>
<tr class="even" valign="top">
	<td  class="text" align="right"><b>Type</b></td>
	<td class="text" ><netui:select tagId="type" dataSource="actionForm.aBook.book_type" optionsDataSource="${actionForm.bookTypes}" styleClass="text"/>
    </td>
</tr>
<tr class="odd" valign="top">               
	<td  class="text" align="right"><b>Author</b></td>
	<td class="text" ><netui:textBox tagId="author" dataSource="actionForm.aBook.author" size="20" styleClass="text"/>
   </td>
</tr>
<tr class="even" valign="top">
	<td  class="text" align="right"><b>Publication</b> </td>
	<td class="text" ><netui:textBox tagId="publication" dataSource="actionForm.aBook.publication" size="20" styleClass="text" />
   </td>
</tr>
<tr class="odd" valign="top">
	<td  class="text" align="right">Publication Date</td>
	<td class="text">
  		<table border="0" cellpadding="0" cellspacing="0"><tr>
  		<td class="text"><netui:textBox tagId="date" dataSource="actionForm.aBook.publication_Date" styleClass="text" size="12" maxlength="10"/>&nbsp;</td>
  		<td class="text"></td>
  		</tr></table></td>
</tr>
<tr class="even" valign="top">
	<td  class="text"  align="right"><b>ISBN #</b></td>
	<td class="text" ><netui:textBox tagId="isbn" dataSource="actionForm.aBook.isbn" size="13" styleClass="text"/>
   </td>
</tr>
<tr class="odd" valign="top">
	<td  class="text" align="right"><b>Catalog #</b></td>
	 <td class="text" ><netui:textBox tagId="catalog" dataSource="actionForm.aBook.catalogNo" size="20" styleClass="text"/>
     </td>
</tr>
<tr class="even" valign="top">
	<td  class="text" align="right">Comments</td>
	<td class="text" ><netui:textArea tagId="comments" dataSource="actionForm.aBook.comments" cols="30" rows="6"  styleClass="text"/>
&nbsp;&nbsp;&nbsp;<netui:error key="addBook.error.invalidLength"></netui:error></td>
</tr>
 <tr class="odd" valign="top">
	<td class="text"  align="right">&nbsp;</td>
	<td class="text" ><netui:checkBox tagId="stock" dataSource="actionForm.aBook.available"/>In Stock</td>
</tr>
</table> <br>
<netui:button action="addBook" type="submit" styleClass="text" > submit</netui:button>
<netui:button type="reset" styleClass="text" >Reset</netui:button>

 <br><br>
 <netui:anchor action="begin" styleClass="text" >${bundle.catalog.back2Menu}</netui:anchor> 
</netui:form>
 </netui-template:section >
</netui-template:template>
