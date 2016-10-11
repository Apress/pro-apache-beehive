<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>
 <netui-template:template templatePage="librarytemplate.jsp">
    <netui-template:section name="body">
    <netui-data:declareBundle bundlePath="apress.beehive.resources.template" name="catalog"/>
      <table border="0" cellpadding="6" cellspacing="0">
        <tr><td ><span class="promo">
            <netui:anchor action="showAddBookPage" styleClass="text" > ${bundle.catalog.addBookTitle} </netui:anchor><br>
            <netui:anchor action="showSearchBookPage" styleClass="text" > ${bundle.catalog.searchBooks}</netui:anchor><br>
            <netui:anchor action="searchAmazon" styleClass="text" >  ${bundle.catalog.amazonSearch} </netui:anchor><br>
            </span> </td>
         </tr>
    </table>
   </netui-template:section >
</netui-template:template>
