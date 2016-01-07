<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>CheckBox fieldValue Test</title>
</head>
<body>
<s:form>
<s:iterator value="magazineList">
    <s:checkbox name="magazines" 
            label="%{name}"
            fieldValue="%{code}"/>
</s:iterator>
<s:submit/>
</s:form>
</body>
</html>
