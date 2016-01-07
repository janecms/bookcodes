<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Thank you</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
    <h3>Added employee</h3>
    <table>
    <tr>
        <td>First Name</td>
        <td><s:property value="firstName"/></td>
    </tr>
    <tr>
        <td>Last Name</td>
        <td><s:property value="lastName"/></td>
    </tr>
    <tr>
        <td>Street Name</td>
        <td><s:property value="address.streetName"/></td>
    </tr>
    <tr>
        <td>Street Number</td>
        <td><s:property value="address.streetNumber"/></td>
    </tr>
    <tr>
        <td>City</td>
        <td><s:property value="address.city"/></td>
    </tr>
    <tr>
        <td>State</td>
        <td><s:property value="address.state"/></td>
    </tr>
    <tr>
        <td>Zip Code</td>
        <td><s:property value="address.zipCode"/></td>
    </tr>
    </table>
</div>
</body>
</html>
