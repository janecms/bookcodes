<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
<s:actionerror />
	<h3>Add a product</h3>
	<s:form action="Product_save">
    	<s:textfield label="Product Name" key="productName"/>
    	<s:textfield label="Description" key="description"/>
    	<s:textfield label="Price" key="price"/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
