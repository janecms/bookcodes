<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>push Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:250px">
	<h3>Employee Details</h3>
	<s:push value="#session.employee">
        Employee Id: <s:property value="id"/>
        <br/>First Name: <s:property value="firstName"/>
        <br/>Last Name: <s:property value="lastName"/>
	</s:push>
</div>
</body>
</html>
