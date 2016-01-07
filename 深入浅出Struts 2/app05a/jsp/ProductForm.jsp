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
	<s:form action="Product_save" method="get">
    	<s:hidden key="division"/>
    	<s:label key="productName"/>
    	<s:textfield label="Product Name" key="productName"/>
    	<s:textfield label="Price" maxlength="5" size="10" key="price"/>
    	<s:checkbox label="inStock" key="inStock"/>
    	<s:radio label="Supplier" name="supplier" list="suppliers"/>
    	<s:textarea label="Description" key="description" rows="4" cols="20"/>
    	<s:submit/>
<input type="radio" name="city"/>Atlanta
<input type="radio" name="city"/>Chicago
<input type="radio" name="city"/>Detroit
<select name="city2">
    <option>Atlanta</option>
    <option>Chicago</option>
    <option>Detroit</option>
</select>

	</s:form>
</div>



<br/><br/>
<br/><br/>
<br/><br/>
<br/><br/>
<br/><br/>
<br/><br/>
<br/><br/>
</body>
</html>
