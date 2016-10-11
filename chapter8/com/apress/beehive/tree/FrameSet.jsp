<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>
 <netui:html>
    <head>
        <title>
            Frame Set
        </title>
        <netui:base target="/tree/"/>
    </head>
    <frameset cols="20%,*">
        <frame src="tree.jsp" name="navFrame" id="navFrame">
        <frame src="root.jsp" name="contentFrame" id="contentFrame">
    </frameset>
</netui:html>