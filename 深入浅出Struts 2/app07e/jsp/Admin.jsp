<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Add Employees</title>
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
	<s:fielderror/>
	<s:form theme="simple" action="Admin2">
	    <table>
	    <tr>
	        <th>First Name</th>
	        <th>Last Name</th>
	        <th>Birth Date</th>
	    </tr>
	    <tr>
	        <td><s:textfield name="employees[0].firstName"/></td>
	        <td><s:textfield name="employees[0].lastName"/></td>
	        <td><s:textfield name="employees[0].birthDate"/></td>
        </tr>	        
	    <tr>
	        <td><s:textfield name="employees[1].firstName"/></td>
	        <td><s:textfield name="employees[1].lastName"/></td>
	        <td><s:textfield name="employees[1].birthDate"/></td>
        </tr>
        <tr>
            <td colspan="3"><s:submit/></td>
        </tr>
        </table>	    
	</s:form>

</div>
</body>
</html>
