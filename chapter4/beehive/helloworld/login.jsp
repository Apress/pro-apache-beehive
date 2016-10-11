<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<netui:html>
  <head>
    <title>Login</title>
    <netui:base/>
  </head>
  <netui:body>
    <p>
     <p>
           <netui:form action="processLogin">
             <p>User Name:	<netui:textBox dataSource="actionForm.username"/>
             <p>Password:	<netui:textBox dataSource="actionForm.password" password="true" size="20"  />
             <dataSource="actionForm.name"/>
             <p><netui:button type="submit">Submit</netui:button>   <netui:button  action="cancel">Cancel</netui:button>   
           </netui:form>
         </p>	

    </p>
  </netui:body>
</netui:html>