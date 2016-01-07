<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>bean Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:250px">
    <s:bean name="app06a.DegreeConverter" id="converter">
        <s:param name="fahrenheit" value="212"/>
    </s:bean>
   	212&deg;F=<s:property value="#converter.celcius"/>&deg;C
</div>
</body>
</html>
