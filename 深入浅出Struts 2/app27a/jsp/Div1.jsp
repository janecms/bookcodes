<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<title>Div</title>
<sx:head/>
</head>
<body>
<sx:div
        cssStyle="border:1px solid black;height:75px;width:100px"
        href="ServerTime.action" 
        updateFreq="3000"
        highlightColor="#cecdee">
 	Server time will be displayed here
</sx:div>
</body>
</html>
