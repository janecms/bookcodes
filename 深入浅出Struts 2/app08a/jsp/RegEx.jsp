<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>regex Validator Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
	color:red;
}
</style>
</head>
<body>
<div id="global" style="width:350px">
	<h3>Enter a phone number</h3>
	<s:form action="RegEx2">
    	<s:textfield name="phone" label="Phone (xxx-xxx-xxxx)"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>