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
<div id="global" style="width:350px">
	<h3>Enter employee details</h3>
	<s:form action="Employee2">
    	<s:textfield name="firstName" label="First Name"/>
    	<s:textfield name="lastName" label="Last Name"/>
    	<s:textfield name="address.streetName" label="Street Name"/>
    	<s:textfield name="address.streetNumber" label="Street Number"/>
    	<s:textfield name="address.city" label="City"/>
    	<s:textfield name="address.state" label="State"/>
    	<s:textfield name="address.zipCode" label="Zip Code"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
