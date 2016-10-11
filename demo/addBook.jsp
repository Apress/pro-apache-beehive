<%@ page language="java" contentType="text/html;charset=UTF-8"%>

<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui" %>
<netui:html>
<head>
<title>
 Book Store- Add Book
</title>
</head>
<body>
<netui:form action="addBook" tagId="addBookForm">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr valign="top">
	<td >Add Book <br>
		Required fields are in <b>bold</b>.</td>
	<td align="right" valign="top"></td>
</tr>
</table><br>
<netui:errors />
<table border="0" cellpadding="6" cellspacing="0" width="100%">
<tr valign="top">
	<td align="right"><b>Name/Title</b></td>
	<td><netui:textBox tagId="name"dataSource="actionForm.name" size="40"/>
    &nbsp;&nbsp;&nbsp;<netui:error value="error.bookDetails.requiredName" /></td>
</tr>
<tr valign="top">
	<td align="right"><b>Type</b></td>
	<td><netui:select tagId="type" dataSource="actionForm.type" optionsDataSource="actionForm.bookTypes" />
    &nbsp;&nbsp;&nbsp;<netui:error value="error.bookDetails.requiredType" /></td>
</tr>
<tr valign="top">
	<td align="right"><b>Author</b></td>
	<td><netui:textBox tagId="author" dataSource="actionForm.author" size="20"/>
    &nbsp;&nbsp;&nbsp;<netui:error value="error.bookDetails.requiredAuthorName" /></td>
</tr>
<tr valign="top">
	<td align="right"><b>Publication</b> </td>
	<td><netui:textBox tagId="publication" dataSource="actionForm.publication" size="20" />
    &nbsp;&nbsp;&nbsp;<netui:error value="error.bookDetails.requiredPublicaionName" /></td>
</tr>
<tr valign="top">
	<td align="right">Publication Date</td>
	<td><netui:textBox tagId="pubDate" dataSource="actionForm.publicationDate" size="12" /></td>
</tr>
<tr valign="top">
	<td align="right"><b>ISBN #</b></td>
	<td><netui:textBox tagId="isbn" dataSource="actionForm.isbn" size="13"/>
    &nbsp;&nbsp;&nbsp;<netui:error value="error.bookDetails.requiredISBN" /></td>
</tr>
<tr valign="top">
	<td align="right"><b>Catalog #</b></td>
	 <td><netui:textBox tagId="catalog" dataSource="actionForm.catalogNo" size="20"/>
     &nbsp;&nbsp;&nbsp;<netui:error value="error.bookDetails.requiredCatalog" /></td>
</tr>
<tr valign="top">
	<td align="right">Comments</td>
	<td><netui:textArea tagId="comments" dataSource="actionForm.comments" cols="30" rows="6" /></td>
</tr>
 <tr valign="top">
	<td align="right">&nbsp;</td>
	<td><netui:checkBox tagId="stock" dataSource="actionForm.inStock"/>In Stock</td>
</tr>
</table> <br>
 <netui:button type="submit">Submit</netui:button>
<netui:button type="submit">Reset</netui:button>
 <br><br>

</netui:form>
</body>
</netui:html>
