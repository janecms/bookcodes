<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>email Validator Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
	color:red;
}
</style>
</head>
<body>
<div id="global" style="width:350px">
	<h3>Enter your email</h3>
	<s:form action="Email2">
    	<s:textfield name="email" label="Email"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
