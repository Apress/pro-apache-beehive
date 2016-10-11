<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui" %>
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="temp" %>
<%@ taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="db"%>

<temp:template templatePage="/demo/DemoHeader.jsp">
  <temp:setAttribute name="title" value="Demo Results" />
  <temp:setAttribute name="pageTitle" value="Demo Results" />
  <temp:section name="wizBody">
    </tr><tr>
    <td class="wizbody" colspan="3">Name: <b><netui:span value="${pageFlow.name}"/></b></td>
    </tr>
    <db:repeater dataSource="pageFlow.results">
        <db:repeaterItem>
            <tr>
                <td class="wizbody" colspan="3"><netui:span value="${container.item}"/></td>
            </tr>
        </db:repeaterItem>
    </db:repeater>
<tr>
  <td class="wizbodyright" colspan="3" ><hr>
    <netui:anchor action="begin">Back</netui:anchor>
  </td>

</td>

  </temp:section>
</temp:template>
