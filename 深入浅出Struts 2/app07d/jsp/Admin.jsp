<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Add Employee</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
    color:red;
}
</style>
</head>
<body>
<div id="global" style="width:450px">
	<h4>Add Employees</h4>
	<s:form action="Admin2">
	    <s:textfield name="adminId" label="Admin ID"/>
	    <s:textfield name="employee.firstName" 
	            label="Employee First Name"/>
	    <s:textfield name="employee.lastName" 
	            label="Employee Last Name"/>
	    <s:textfield name="employee.birthDate" 
	            label="Employee Birth Date (yyyy-MM-dd)"/>
        <s:submit/>    
	</s:form>
</div>
</body>
</html>
