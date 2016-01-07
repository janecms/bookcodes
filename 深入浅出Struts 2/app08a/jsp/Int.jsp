<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>int Validator Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
	color:red;
}
</style>
</head>
<body>
<div id="global" style="width:350px">
	<h3>Enter a year</h3>
	<s:form action="Int2">
    	<s:textfield name="year" label="Year (1990-2009)"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>