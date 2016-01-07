<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>property Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:250px">
    Temperature:<s:property value="temperature"/>
    <%-- Default to Fahrenheit--%>
    <s:property value="#application.degreeSymbol" 
    		escape="false"
    		default="&deg;F"
    />
</div>
</body>
</html>
