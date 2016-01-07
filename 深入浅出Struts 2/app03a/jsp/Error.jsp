<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Error</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
An error has occurred. Please send a report to the admin.
<br/>Exception message: <s:property value="exception.message"/>
<br/>Exception stack trace: <s:property value="exceptionStack"/>
</div>
</body>
</html>
