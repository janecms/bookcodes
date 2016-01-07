<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Login Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
<s:actionerror />
	<h3>Login</h3>
	<s:form action="User_login">
    	<s:textfield label="User Name" key="userName"/>
    	<s:textfield label="Password" key="password"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
