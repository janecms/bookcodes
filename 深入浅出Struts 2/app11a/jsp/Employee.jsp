<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Employee List</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
	<h3>Add New Employee</h3>
	<s:form action="Employee_create">
    	<s:textfield label="First Name" key="firstName"/>
    	<s:textfield label="Last Name" key="lastName"/>
    	<s:submit/>
	</s:form>
	<hr/>
	<table style="width:100%;text-align:left">
	<tr>
		<th>Employee Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<s:iterator value="employees" status="rowstatus">
	<tr>
    	<td><s:property value="id"/></td>
    	<td><s:property value="firstName"/></td>
    	<td><s:property value="lastName"/></td>
    	<td>
    		<s:url id="editUrl" value="Employee_edit.action">
                <s:param name="employeeId" value="id"/>
            </s:url>
            <s:a href="%{editUrl}">Edit</s:a>
        </td>    
    	<td>
    		<s:url id="deleteUrl" value="Employee_delete.action">
                <s:param name="employeeId" value="id"/>
            </s:url>
            <s:a href="%{deleteUrl}">Delete</s:a>
        </td>    
  	</tr>
	</s:iterator>
	</table>
</div>
</body>
</html>
