<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Confirmation</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:350px">
    <h4>Employees Created:</h4>
    <ul>
    <s:iterator value="employees.keySet()" id="key" status="stat">
        <li><s:property value="#key"/>:
            <s:property value="employees[#key].firstName"/>
            <s:property value="employees[#key].lastName"/>
        </li>
    </s:iterator>
    </ul>
</div>
</body>
</html>
