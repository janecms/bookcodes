<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>generator Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:250px">
    <s:generator val="%{'Honda,Toyota,Ford,Dodge'}"
            separator=",">
        <ul>
        <s:iterator>
            <li><s:property/></li>        
        </s:iterator>
        </ul>
    </s:generator>
    
    <s:generator id="cameras" 
            count="3"
            val="%{'Canon,Nikon,Pentax,FujiFilm'}"
            separator=",">
    </s:generator>
    <s:iterator value="#attr.cameras">
        <s:property/>
    </s:iterator>
</div>
</body>
</html>
