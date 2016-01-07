<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Employee Details</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:350px">
    Admin Id: <s:property value="adminId"/>
    <h4>Employee Created:</h4>
    <s:property value="employee.firstName"/>
    <s:property value="employee.lastName"/>
    (<s:date name="employee.birthDate" 
            format="MMM dd, yyyy"/>)
</div>
</body>
</html>
