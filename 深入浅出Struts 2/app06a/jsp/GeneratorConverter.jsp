<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Generator Converter Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:250px">
    <s:generator val="%{'Honda,Toyota,Ford,Dodge'}"
            separator=","
            converter="myConverter">
        <ul>
        <s:iterator>
            <li><s:property/></li>        
        </s:iterator>
        </ul>
    </s:generator>
    
</div>
</body>
</html>
