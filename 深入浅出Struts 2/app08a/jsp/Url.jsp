<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>url Validator Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
	color:red;
}
</style>
</head>
<body>
<div id="global" style="width:350px">
	<h3>What is your website?</h3>
	<s:form action="Url2">
    	<s:textfield name="url" label="URL" size="40"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
