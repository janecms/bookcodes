<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<title>Auto Completer</title>
<sx:head/>
</head>
<body>
<s:form action="ShowSelection" theme="simple">
    <sx:autocompleter name="carMake" list="carMakes"/>
    <s:submit/>
</s:form>  
</body>
</html>
