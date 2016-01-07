<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<title>Auto Completer</title>
<sx:head/>
</head>
<body>
<s:form action="ShowSelection" theme="simple">
    <sx:autocompleter 
    	name="carMake" 
    	dataFieldName="make"
    	href="CarMakesAsJSON2.action"/>
    <s:submit/>
</s:form>  
</body>
</html>
