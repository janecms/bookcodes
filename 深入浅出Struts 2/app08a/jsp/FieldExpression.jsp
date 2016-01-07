<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>fieldexpression Validator Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
	color:red;
}
</style>
</head>
<body>
<div id="global" style="width:400px">
	<h3>Enter the minimum and maximum temperatures</h3>
	<s:form action="FieldExpression2">
    	<s:textfield name="min" label="Minimum temperature"/>
    	<s:textfield name="max" label="Maximum temperature"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
