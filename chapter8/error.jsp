<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<netui:html>
  <head>
    <title>NetUI Error</title>
    <style>
    table {
        border: solid 1pt #90180F;
        background-color: #ffffff;
    }
    body {
        margin: 20pt 5%;
        background-color: #fdf4b6;
        font-family: Arial, Helvetica, sans-serif;
        font-size: 10pt;
    }
    .caption {
        font-weight: bold;
        font-size: 20pt;
        text-align: left;
        width: 500px
    }
    th {vertical-align: top;
        text-align: right;
        font-size: 12pt;
        color: #90180F;
        width: 100px;
    }
    td {
        text-align: left;
        }
    hr {
        color: #90180F;
    }
    .posTitle {
        position: relative; 
        color: #6C0C06;
        left: -160pt; 
        top: -12pt; 
    }
    .pfErrorLineOne {
        color: red;
        font-size: 12pt;
        font-style: italic;
    }
    img {
        border: solid 2pt #90180F;
    }
    </style>
    <netui:base/>
  </head>
  <netui:body>
    <div class="caption">
    <netui:image src="${pageContext.request.contextPath}/resources/beehive/version1/images/error-header.jpg" width="338" height="96" alt="Page Flow Error"/>
    <span class="posTitle">NetUI Error</span>
    </div>
    <table border="0" cellspacing='0' cellpadding='4'>
       <c:if test="${request.errorMessage != null}">
            <tr><th>Message:</th><td class="pfErrorLineOne"><netui:label value="${request.errorMessage}" defaultValue="&nbsp;"/></td></tr>
       </c:if> 
       <tr><th>Exception:</th><td class="pfErrorLineOne"><netui:exceptions showMessage="true"/></td></tr> 
       <tr><td colspan="2" style="min-width:342"><hr></td></tr>     
       <tr><th>Stack Trace:</th><td><netui:exceptions showMessage="false" showDevModeStackTrace="true"/></td></tr>
    </table>      
  </netui:body>
</netui:html>
<%-- Some browsers will not display this page unless the response status code is 200. --%>
<% response.setStatus(200); %>
