<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>

<netui-data:declareBundle bundlePath="apress.beehive.resources.template" name="catalog"/>

<netui:html>
    <head>
        <title>
          <netui-template:attribute name="title"/>
        </title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/beehive/version1/css/main.jsp" />
    </head>
    <netui:body>
         <br/>
            <div>
                <br/>
                <netui-template:includeSection name="body"/>
            </div>
    </netui:body>
</netui:html>
