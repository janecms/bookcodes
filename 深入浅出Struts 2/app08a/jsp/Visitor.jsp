<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>visitor Validator Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
	color:red;
}
</style>
</head>
<body>
<div id="global" style="width:350px">
	<h3>Enter user name and password</h3>
	<s:form action="Required2">
    	<s:textfield name="userName" label="User Name"/>
    	<s:textfield name="password" label="Password"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
