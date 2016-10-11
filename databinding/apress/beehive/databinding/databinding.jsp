<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui" %>
<%@ taglib prefix="netui-data" uri="http://beehive.apache.org/netui/tags-databinding-1.0"%> 
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="temp" %>
<%@ page import="java.util.Map"%>
<%@ page import="java.lang.String"%> 
<head>
<title>netui: Data Binding tags </title>
  
</head>
<netui:form action="begin" tagId="form2" genJavaScriptFormSubmit="true">

<netui-data:getData resultId="rowCount" value="${pageFlow.persons}"/>

<% Map personMap=((Map)pageContext.getAttribute("rowCount")); 
   int size = personMap.size();
 %>

<p>
This is the example using <br>
netui-data:repeater , <br>
netui-data:repaterHeader,<br> 
netui-data:reaterFooter, <br>
netui-data:repeaterItem<br>
netui-data:callPageFlow<br>
netui-data:methodParameter  <br>
netui-data:message  <br> 
netui-data:messageArg <br>
netui-data:pad <br>


</p>
No of rows is : <b><%=size%></b> (only two are displayed bcos of the padding .. (netui-data:pad) change the value of maxrepeat in this tag to display more


<netui-data:repeater dataSource="pageFlow.persons" defaultText="No Persons Found">


 <netui-data:repeaterHeader>
    <table border="1" cellpadding="6" cellspacing="1" width="100%">
    <tr valign="bottom">
        <td><b>First Name</b></td>
        <td><b>Last Name</b></td>
         <td><b>Phone</b></td>
        <td><b>E-mail</b></td>
        <td><b>State (using callPageFlow) </b></td>
        <td><b>State (using callMethod) </b></td>
   
    </tr>
 </netui-data:repeaterHeader>
 <netui-data:pad minRepeat="1" maxRepeat="2" padText="test"/>
  <netui-data:repeaterItem>
	<tr>

    <td><b><netui:content value="${container.item.firstName}" /></b></td>
  	<td><netui:content value="${container.item.lastName}" /></td>
  	<td><netui:content value="${container.item.phone}" /></td>
  	<td><netui:content value="${container.item.email}" /></td>
  	  
  	  <netui-data:callPageFlow  method="getStateName"  resultId="stateValue" object="apress.beehive.databinding.Controller">
  	   <netui-data:methodParameter value="${container.item.state}"/>
	</netui-data:callPageFlow>
	
	<!--
	In JSP 2.0, the "pageContext" is used to refer to the class 
	"javax.servlet.jsp.PageContext" as a JavaBean.  In order to data bind 
	to 
	the attributes that are in the PageContext's attribute map, try using 
	the "pageScope" implicit object. -->

	<td><netui:content value="${pageScope.stateValue}"/> </td>
	
	<%
	        pageContext.setAttribute("msgSkeleton", new String("{0} stands for {1}"));
	 %>
	       <netui-data:message value="${pageScope.msgSkeleton}" resultId="message">
	        <netui-data:messageArg value="${container.item.state}"/>
	        <netui-data:messageArg value="${pageScope.stateValue}"/>
	    </netui-data:message>

  <td>  <netui:content value="${pageScope.message}"/></td>
  </tr>
  </netui-data:repeaterItem>
  
       <netui-data:repeaterFooter>
            </table>
        </netui-data:repeaterFooter> 
    </netui-data:repeater>	
<br>  

<br>
<br>

<tr>
<td>
<netui-data:dataGrid dataSource="pageFlow.persons" name="personsGrid">
<netui-data:header title="header"/>
<netui-data:footer title="footer"/>
        </netui-data:dataGrid>

</td>
</tr>
  </netui:form>
