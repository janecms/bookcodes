<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<head>
<meta http-equiv="refresh" content="2;"/>
<title>Wait</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
    color:red;
}
</style>
</head>
<body>
<div id="global" style="width:350px">
    Please wait... (<s:property value="complete"/>% complete)
</div>
</body>
</html>
