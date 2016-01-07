<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Edit Employee</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
	<h3>Edit Employee</h3>
	<s:form action="Employee_update">
    	<s:hidden key="id"/>
    	<s:textfield label="First Name" key="firstName"/>
    	<s:textfield label="Last Name" key="lastName"/>
    	<s:submit value="Update"/>
	</s:form>
</div>
</body>
</html>
