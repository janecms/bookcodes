<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Check out</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
	color:red;
}
</style>
</head>
<body>
<div id="global" style="width:350px">
	<h3>Please enter the amount and your credit card details</h3>
	<s:form action="Pay">
        <s:token/>
    	<s:textfield name="amount" label="Amount"/>
        <s:select name="creditCardType" label="Credit Card"
                list="#{'1':'Visa', '2':'Mastercard', '3':'American Express'}"/>
    	<s:textfield name="nameOnCard" label="Name on Credit Card"/>
    	<s:textfield name="number" label="Credit Card Number"/>
    	<s:textfield name="expiryDate" label="Expiry Date (mm/yy)"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
