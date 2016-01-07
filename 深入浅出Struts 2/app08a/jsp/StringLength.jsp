<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>stringlength Validator Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
	color:red;
}
</style>
</head>
<body>
<div id="global" style="width:480px">
	<h3>Select a user name</h3>
	<s:form action="StringLength2">
    	<s:textfield name="userName" label="User Name (6-14 characters)"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
