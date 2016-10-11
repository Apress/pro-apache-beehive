<%@ page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>
<netui-template:template templatePage="librarytemplate.jsp">
    <netui-template:section name="body">
<netui:form tagId="searchresultsForm" action="begin">
   <netui-data:declarePageInput name="rs" type="java.sql.ResultSet"/>

<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr valign="top">
  	<td class="text"><span class="promotitle">Search Books Results</span></td>
  	<td class="text">
  	<br>

<br><br>

   <netui-data:dataGrid name="booksgrid" dataSource="pageInput.rs">
  <netui-data:configurePager pageSize="3" pagerFormat="prevNext" pageAction="begin.do"/>

     <netui-data:header>
                <netui-data:headerCell headerText="Author" />
                <netui-data:headerCell headerText="Title"/>
                <netui-data:headerCell headerText="ISBN"/>
                <netui-data:headerCell headerText="Publication"/>
                <netui-data:headerCell headerText="Type"/>
            </netui-data:header>

<netui-data:rows>
<netui-data:spanCell  value="${container.item.author}" />
<netui-data:anchorCell action="getBookDetails" value="${container.item.title}" ></netui-data:anchorCell>

<netui-data:spanCell value="${container.item.isbn}"/>
<netui-data:spanCell value="${container.item.publication}"/>
<netui-data:spanCell value="${container.item.book_type}"/>
<!-- <netui-data:imageAnchorCell action="getBookDetails" alt="view" src="" ></netui-data:imageAnchorCell>         -->
</netui-data:rows>
</netui-data:dataGrid>
<BR><BR>
  <netui:anchor action="begin" styleClass="text" >Back To Menu </netui:anchor>

  </netui:form>
</netui-template:section >
</netui-template:template>
