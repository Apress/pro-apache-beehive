<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>
<head>
<title>My Beehive Library</title>

</head>
<netui:form tagId="searchresultsForm" action="begin">

<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr valign="top">
  	<td class="text"><span class="promotitle">Search Books Results</span></td>
  	<td class="text">
  	<br>

<br><br>

<% String toggle="odd"; %>
<netui-data:repeater dataSource="pageFlow.booksMap" defaultText="No Books Found">
 <netui-data:repeaterHeader>
    <table border="0" cellpadding="1" cellspacing="0" width="100%">
    <tr class="sort" valign="bottom">
      <td class="sort"><b>Author</b></td>
        <td class="sort"><b>Title</b></td>
        <td class="sort"><b>ISBN</b></td>
        <td class="sort"><b>Publication</b></td>
         <td class="sort"><b>Type</b></td>
    </tr>
 </netui-data:repeaterHeader>
  <netui-data:repeaterItem>
     <%if(toggle.equals("odd")) {
            toggle="even"; %>
        <tr class="odd">
     <% } else {
        toggle="odd";%>
        <tr class="even">
     <%} %>

    <td class="text"><b><netui:label value="${container.item.author}" /></b></td>

  	<td class="text"><netui:anchor action="getBookDetails" ><netui:label value="${container.item.title}" /><netui:parameter name="bookId" value="${container.item.book_Id}"/>  </netui:anchor></td>
  	<td class="text"><netui:content value="${container.item.isbn}" /></td>
   	<td class="text"><netui:label value="${container.item.publication}" /></td>
   	<td class="text"><netui:label value="${container.item.book_type}" /></td>
  </tr>
  </netui-data:repeaterItem>
       <netui-data:repeaterFooter>
            </table>
        </netui-data:repeaterFooter>
    </netui-data:repeater>
<BR><BR>
  <netui:anchor action="begin" styleClass="text" >Back To Menu </netui:anchor>

  </netui:form>
