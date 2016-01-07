<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Uploaded File</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
    <h3>Uploaded File</h3>
    Description: <s:property value="description"/>
    <br/>Filename: <s:property value="attachmentFileName"/>
    <br/>File size: <s:property value="attachment.length()"/>
</div>    
</body>
</html>

