<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Color</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
    color:red;
}
</style>
</head>
<body>
<div id="global" style="width:450px">
	<h4>Color</h4>
	Please enter the RGB components, each of which is
	an integer between 0 and 255 (inclusive). Separate two components
	with a comma. For example, green is 0,255,0.
	<s:form action="Design2">
	    <s:textfield name="designName" label="Design Name"/>
	    <s:textfield name="color" label="Color"/>
        <s:submit/>	    
	</s:form>

</div>
</body>
</html>
