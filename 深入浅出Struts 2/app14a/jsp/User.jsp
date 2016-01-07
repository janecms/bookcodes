<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Add user</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
	color:red;
}
</style>
</head>
<body>
<div id="global" style="width:350px">
	<h3>Add user</h3>
	<s:form action="User">
    	<s:textfield name="userName" label="User Name"/>
    	<s:textfield name="firstName" label="First Name"/>
    	<s:textfield name="lastName" label="Last Name"/>
    	<s:textfield name="password" label="Password"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
