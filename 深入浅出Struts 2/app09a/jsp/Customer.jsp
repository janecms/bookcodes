<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Customers</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:350px">
<h4>Customer</h4>
<s:form>
    <s:textfield name="name" label="%{getText('customer.name')}"/>
	<s:textfield name="contact" label="%{getText('customer.contact')}"/>
	<s:textfield name="address" label="%{getText('customer.address')}"/>
	<s:textfield name="city" label="%{getText('customer.city')}"/>
	<s:textfield name="zipCode" 
            label="%{getText('customer.zipCode', 'Zip Code')}"/>
	<s:submit/>
</s:form>
</div>
</body>
</html>
