<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui" %>
<%@ taglib prefix="netui-data" uri="http://beehive.apache.org/netui/tags-databinding-1.0"%> 
<%@ taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="temp" %>

<script language="javascript">
function test()
{
alert("This is test function");
}
</script>
<netui:form action="submitAttribute" tagId="form1" name="bean" type="demo.TestBean"  scope="session" genJavaScriptFormSubmit="true">
<table border="0" cellpadding="6" cellspacing="0">

<tr>

<td> Name</td>
<td>
	<netui:textBox dataSource="actionForm.name" >
	<netui:attribute name="tagId" value="name"/>
	<netui:attribute name="size" value="10"/>
	<netui:attribute name="title" value="Enter Name"/>
	<netui:attribute name="maxLength" value="5"/>
	</netui:textBox>
	</td>
	</tr>
<tr>

<td>Type</td>
<td>
	
	<netui:textBox dataSource="actionForm.type" >
	<netui:attribute name="tagId" value="type"/>
	<netui:attribute name="size" value="10"/>
	<netui:attribute name="title" value="Enter Type"/>
	<netui:attribute name="accessKey" value="T"/>
	<netui:attribute name="maxLength" value="5"/>
	</netui:textBox>
	</tr>
	<tr>

<td>Disabled</td>
<td>
	
	<netui:textBox dataSource="actionForm.type" disabled="true">
	<netui:attribute name="tagId" value="type"/>
	<netui:attribute name="size" value="10"/>
	<netui:attribute name="title" value="This is disabled"/>
	<netui:attribute name="accessKey" value="T"/>
	<netui:attribute name="maxLength" value="5"/>
	</netui:textBox>
	</td>
	</tr>
	<tr>

<td> RreadOnly</td>
<td>
	
	<netui:textBox dataSource="actionForm.type" readonly="true" defaultValue="500.00">
	<netui:attribute name="tagId" value="type"/>
	<netui:attribute name="size" value="10"/>
	<netui:attribute name="title" value="This is read only"/>
	<netui:attribute name="accessKey" value="T"/>
	<netui:attribute name="maxLength" value="5"/>
	</netui:textBox>
	</td>
	</tr>
	
	<tr>
	<td>
	<netui:checkBox tagId="check1" title=" Type A" defaultValue="true" dataSource="actionForm.type"  disabled="true"/>  A
	<br>
	<netui:checkBox tagId="check2" title=" Type B" defaultValue="false" dataSource="actionForm.type" disabled="false"/>  B
	<br>
	<netui:checkBox tagId="check3" title=" Type C" defaultValue="true" dataSource="actionForm.type"  disabled="false"/>  C
	</td>
	</tr>                
    
    <tr>
	<td>
	<!-- remember checkbox group does not have attribute tagId,title and it has optionsDataSource attribute-->
    <netui:checkBoxGroup  dataSource="actionForm.selectedStudents" optionsDataSource="actionForm.studentsMap" defaultValue="actionForm.selectedStudents" disabled="false"/>  
	</td>
	</tr> 
	
	<tr>
	<td>
	<!-- remember checkboxgroup cannot have optionsDataSource attribute if it has checkbox options-->
    <netui:checkBoxGroup  dataSource="actionForm.selectedStudents" defaultValue="actionForm.selectedStudents" disabled="false">  
	<netui:checkBoxOption title="Peter" value="actionForm.name" disabled="false"/> Peter
	<netui:checkBoxOption title="John" value="actionForm.type" disabled="false"/>  John
	</netui:checkBoxGroup>
	</td>
	</tr> 
	<netui:label value="pageFlow.today" defaultValue="08/20/2004"  >
	<netui:formatDate country="US" language="en" pattern="yyyy-MM-dd"/>
	</netui:label>
	
	<netui:label value="5554443333" >	
	<netui:formatString country="US" language="en" pattern="(###)###-####" />
	</netui:label>
	
	<netui:label value="555444333333" >	
	<netui:formatString country="US" language="en" pattern="(###)###-####"  truncate="true"/>
	</netui:label>
	
		<netui:label value="555444333333" >		
	<netui:formatString country="US" language="en" pattern="(###)###-####"  truncate="false"/>
	</netui:label>
	
	
	<netui:label value="555444333333" >	
	<netui:formatString country="US" language="en" pattern="$$*"  truncate="false"/>
	</netui:label>
	
	<!-- valid values for type are number, currency, percent -->
	<netui:label value="555444333333" >	
	<netui:formatNumber country="US" language="en" pattern="###,####,###.00"  type="number"/>
	</netui:label>
	
<netui:hidden dataInput="5" dataSource="pageFlow.value1" tagId="value" title="hidden title" disabled="true"/>
	<tr>
	<td>  <netui:button action="submitAttribute" alt="submit" disabled="false" tagId="buton1" title=" submit" type="submit" value="Submit"/></td>
		<td>  <netui:button action="submitAttribute" alt="submit" disabled="false" tagId="buton2" title="Reset" type="reset" value="Reset"/></td>
		
		<td>  <netui:imageButton src="images/beehive_small.gif" align="center" alt="alternate text"   disabled="false" tagId="imagebutton1" title="Reset"  value="Submit"/></td>
	</tr>
	
	
</td>
</tr>
</table>
</netui:form>