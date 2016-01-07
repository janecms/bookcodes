<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>I18N</title>
<style type="text/css">@import url(css/main.css);</style>
<style type="text/css">
img {
	border:none;
}
</style>
</head>
<body>
<div id="global" style="width:350px">
<s:text name="greetings">
    <s:param>Jon</s:param>
</s:text>
</div>

<s:url action="Main2" id="url"/>
<s:a href="%{url}"><img src="images/next.png"/></s:a>
</body>
</html>
