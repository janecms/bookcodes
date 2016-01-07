<html>
<head>
<title>Add Product</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:330px">

<h3>Add Product</h3>

<@s.form action="Product_save">
    <@s.textfield name="name" label="Product Name"/>
    <@s.textfield name="description" label="Description"/>
    <@s.textfield name="price" label="Price"/>
    <@s.submit value="Add Product"/>
</@s.form>
</div>
</body>