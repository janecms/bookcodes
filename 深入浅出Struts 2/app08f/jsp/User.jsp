<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Select user name and password</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
	color:red;
}
</style>
</head>
<body>
<div id="global" style="width:350px">
	<h3>Please select your user name and password</h3>
	<s:form action="User2">
    	<s:textfield name="userName" label="User Name"/>
    	<s:password name="password" label="Password"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
