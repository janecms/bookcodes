<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>File Upload</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
    <h1>Single File Upload</h1>
	<s:fielderror />
    <s:form action="File_singleUpload" 
    		enctype="multipart/form-data">
        <s:textfield name="description" label="Description"/>
        <s:file name="attachment" label="Attachment"/>
        <s:submit />
    </s:form>
</div>
</body>
</html>

