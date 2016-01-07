<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Select Language</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:350px">

<s:url action="Main1" id="enUrl">
    <s:param name="request_locale">en</s:param>
</s:url>
<s:url action="Main1" id="deUrl">
    <s:param name="request_locale">de</s:param>
</s:url>

<h3>Select Language</h3>
    <ul>
        <li><s:a href="%{enUrl}">English</s:a></li>
        <li><s:a href="%{deUrl}">Deutsch</s:a></li>
    </li>
</div>
</body>
</html>
