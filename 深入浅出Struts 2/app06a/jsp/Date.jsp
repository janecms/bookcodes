<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>date Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:350px">
    <s:bean name="java.util.Date" id="today"/>
    Today (original format): <s:property value="#today"/>
    <s:date name="#today" id="format1" format="M/dd/yyyy"/>
    <br/>Today (mm/dd/yyyy): <s:property value="#format1"/>

    <s:date name="#today" id="format2" format="MMM d, yyyy"/>
    <br/>Today (MMM d, yyyy): <s:property value="#format2"/>

    <s:date name="#today" id="format3" format="MMM d, yyyy hh:mm"/>
    <br/>Today (MMM d, yyyy hh:mm): <s:property value="#format3"/>
    
</div>
</body>
</html>
