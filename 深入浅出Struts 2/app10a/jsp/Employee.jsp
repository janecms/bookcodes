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
	</tr>
	<s:iterator value="employees" status="rowstatus">
	<tr>
    	<td><s:property value="id"/></td>
    	<td><s:property value="firstName"/></td>
    	<td><s:property value="lastName"/></td>
  	</tr>
	</s:iterator>
	</table>
</div>
</body>
</html>
