<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>
<netui:html>
    <head>
        <title>
            My Beehive Library
        </title>
    </head>
    <body>
    <link rel="stylesheet" type="text/css" href="../../../../resources/beehive/version1/css/main.jsp" />
    <netui:form action="submitSearchBook" tagId="searchBook" genJavaScriptFormSubmit="true">
        <table border="0" cellpadding="3" cellspacing="0" width="100%" >
	  	<tr><td class="corpsubhead"><span class="promo"><B>Search Books</b></span></td></tr>
	  	<tr><td colspan="2" class="promo">


	  	<table border="0" cellpadding="2" cellspacing="0">
	  	<tr class="even" valign="top">
			<td  class="text" align="right"><b>Type</b></td>
			<td class="text" ><netui:select tagId="type" dataSource="actionForm.aBook.book_type" optionsDataSource="${actionForm.bookTypes}" styleClass="text"/>
    			</td>
	  		</TR>
	  		<tr class="odd" valign="top">
				<td  class="text" align="right"><b>Author</b></td>
				<td class="text" ><netui:textBox tagId="author" dataSource="actionForm.aBook.author" size="20" styleClass="text"/>
			   </td>
</tr>
	  		<TR>

	  		<td><netui:button action="submitSearchBook" type="submit" styleClass="text" > Search </netui:button> </td>
	  		<td><netui:button action="showAddBookPage" type="submit" styleClass="text" > Add New Book </netui:button> </td>
	  	</tr></table>

	  	</td></tr>
  </table>
  <BR><BR>
  <netui:anchor action="begin" styleClass="text" >Back To Menu </netui:anchor>
  </netui:form>
    </body>
</netui:html>