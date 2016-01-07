<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Transaction Complete</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:350px">
    <h4>Transaction details:</h4>
    <table>
    <tr>
        <td>Account ID:</td>
        <td><s:property value="accountId"/>
    </tr>
    <tr>
        <td>Transaction Date:</td>
        <td><s:date name="transactionDate" format="MMM dd, yyyy"/>
    </tr>
    <tr>
        <td>Transaction Type:</td>
        <td><s:property value="transactionType"/>
    </tr>
    <tr>
        <td>Amount:</td>
        <td><s:property value="amount"/>
    </tr>
    </table>
</div>
</body>
</html>
