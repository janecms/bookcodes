<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>File Download</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:200px">

    <h3>Products</h3>
    <table>
    <tr>
        <th>Name</th>
        <th>Picture</th>
    </tr>
    <s:iterator value="products" id="product">
        <tr>
            <td><s:property value="#product.name"/></td>
            <td>
                <s:url id="url" action="GetImage">
                    <s:param name="productId">
                        <s:property value="#product.id"/>
                    </s:param>
                </s:url>
                <img src="<s:property value='#url'/>" 
                        width="100" height="50"/>
            </td> 
        </tr>
    </s:iterator>
    </table>
</div>
</body>
</html>

