<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Design Details</title>
<style type="text/css">@import url(css/main.css);</style>
<style type="text/css">
.colorSample {
    border:1px solid black;
    width:100%;
    height:100px;
    background:#<s:property value="color.hexCode"/>;
}
</style>
</head>
<body>
<div id="global" style="width:250px">
    <h4>Design details:</h4>
    Design name: <s:property value="designName"/>
    <br/>Color code: <s:property value="color"/>
    <div class="colorSample"/>
</div>
</body>
</html>
