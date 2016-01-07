<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
	<h3>Add a product</h3>
	<form method="post" action="Product_save.action">
	<table>
	<tr>
		<td>Product Name:</td>
		<td><input type="text" name="productName"/></td>
	</tr>
	<tr>
		<td>Description:</td>
		<td><input type="text" name="description"/></td>
	</tr>
	<tr>
		<td>Price:</td>
		<td><input type="text" name="price"/></td>
	</tr>
	<tr>
		<td><input type="reset"/></td>
		<td><input type="submit" value="Add Product"/></td>
	</tr>
	</table>
	</form>
</div>
</body>
</html>
