<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>File Upload</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
    <h1>Multiple File Upload</h1>
	<s:actionerror />
	<s:fielderror />
    <s:form action="File_multipleUpload" 
    		enctype="multipart/form-data">
        <s:file name="attachment" label="Attachment 1"/>
        <s:file name="attachment" label="Attachment 2"/>
        <s:file name="attachment" label="Attachment 3"/>
        <s:submit />
    </s:form>
</div>    
</body>
</html>

