<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui" %>

<netui:html>
    <head>
        <title>
           Book Store- View Book
        </title>
    </head>
    <body>
    <netui:form action="addBook" tagId="viewBookForm">
    <table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr valign="top">
  	<td>View Book<br></td>
	<td align="right" valign="top"></td>
  </tr>
</table><br>

<table border="0" cellpadding="6" cellspacing="0" width="100%">
  <tr valign="top">
  	<td align="right">Name</td>
  	<td><netui:label value="{actionForm.name}" />
    </td>
  </tr>
  <tr valign="top">
  	<td align="right">Type</td>
  	<td><netui:label value="actionForm.type" /></td>
  </tr>
  <tr valign="top">
  	<td align="right">Author</td>
  	<td><netui:label value="actionForm.author" /></td>
  </tr>
  <tr valign="top">
  	<td align="right">Publication </td>
  	<td><netui:label value="actionForm.publication" /></td>
  </tr>
  <tr valign="top">
  	<td align="right">Publication Date</td>
  	<td><netui:label value="actionForm.publicationDate"/></td>
  </tr>
  <tr valign="top">
  	<td align="right">ISBN #</td>
  	<td><netui:label value="actionForm.isbn"/></td>
  </tr>
  <tr valign="top">
  	<td align="right">Catalog #</td>
  	 <td><netui:label value="actionForm.catalogNo" /></td>
  </tr>
    <tr valign="top">
  	<td align="right">Comments</td>
  	<td><netui:label value="actionForm.comments"/></td>
  </tr>
   <tr valign="top">
  	<td align="right">&nbsp;</td>
  	<td><netui:checkBox dataSource="actionForm.inStock" tagId="stock"/>In Stock</td>
  </tr>
</table> <br>
 <netui:button type="submit">Submit</netui:button>
  <netui:button type="submit">Reset</netui:button>
 <br><br>

</netui:form>
    </body>
</netui:html>
