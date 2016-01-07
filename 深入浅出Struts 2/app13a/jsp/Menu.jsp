<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>File Download</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:200px">

    <s:url id="url1" action="ViewCss">
        <s:param name="filePath">css/main.css</s:param>
    </s:url>
    <s:a href="%{url1}">View CSS</s:a>
    
    <br/> 
    <s:url id="url2" action="DownloadCss">
        <s:param name="filePath">css/main.css</s:param>
    </s:url>
    <s:a href="%{url2}">Download CSS</s:a> 
</div>
</body>
</html>

