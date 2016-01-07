<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>I18N</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:350px">

<s:i18n name="app12c.resourcebundle.MyCustomResourceBundle">
    <s:text name="greetings">
        <s:param>Jon</s:param>
    </s:text>.
    <s:text name="farewell"/>
</s:i18n>
</div>
</body>
</html>
