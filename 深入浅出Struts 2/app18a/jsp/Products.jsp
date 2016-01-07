<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Products</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:600px">
	<table style="width:100%">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Description</th>
		<th style="text-align:right">Price</th>
	</tr>
	<s:iterator value="products">
	<tr>
	    <td><s:property value="productId"/></td>
	    <td><s:property value="name"/></td>
	    <td><s:property value="description"/></td>
	    <td style="text-align:right">$<s:property value="price"/></td>
	</tr>
	</s:iterator>
	</table>
</div>
</body>
</html>
