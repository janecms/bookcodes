<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>date Validator Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
	color:red;
}
</style>
</head>
<body>
<div id="global" style="width:350px">
	<h3>Enter your birthdate</h3>
	<s:form action="Date2">
    	<s:textfield name="birthDate" label="Birth Date"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
