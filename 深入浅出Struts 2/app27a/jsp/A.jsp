<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<title>A</title>
<sx:head/>
</head>
<body>
<sx:div id="div1" 
    cssStyle="height:50px;width:200px;border:1px solid brown"/>
<sx:div id="div2" 
    cssStyle="height:50px;width:200px;border:1px solid brown"/>
<sx:a href="ServerTime.action" targets="div1,div2">
    Update Time
</sx:a>
</body>
</html>
