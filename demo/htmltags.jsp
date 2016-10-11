<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui" %>
<%@ taglib prefix="netui-data" uri="http://beehive.apache.org/netui/tags-databinding-1.0"%> 
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="temp" %>


<table border="0" cellpadding="6" cellspacing="0">
  <tr><td >
  <netui:anchor action="displayAnchor"> anchor </netui:anchor><br>
  <netui:anchor action="displayAttribute"> attribute</netui:anchor><br>
  <netui:anchor action="sutmitBase"> base </netui:anchor><br>
  
   <netui:anchor action="sutmitBindingUpdateErrors"> bindinUpdateErrors </netui:anchor><br>
  <netui:anchor action="sutmitBindingUpdateErrors"> body</netui:anchor><br>
  <netui:anchor action="sutmitBindingUpdateErrors"> button </netui:anchor><br>
  
  
  </td></tr>
</table>