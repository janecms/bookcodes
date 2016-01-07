<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>set Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:250px">
	<h3>Customer Details</h3>
	<s:set name="customer" value="#session.customer"/>
	Contact: <s:property value="#customer.contact"/>
	<br/>Email: <s:property value="#customer.email"/>
</div>
</body>
</html>
