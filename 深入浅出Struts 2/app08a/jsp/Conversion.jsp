<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>conversion Validator Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
	color:red;
}
</style>
</head>
<body>
<div id="global" style="width:350px">
	<h3>Enter your age</h3>
	<s:form action="Conversion2">
    	<s:textfield name="age" label="Age"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
