<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Confirmation</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:350px">
    <h4>Employee Created:</h4>
    <table>
    <s:iterator value="employees">
        <tr>
            <td><s:property value="firstName"/> 
            <s:property value="lastName"/>
            (<s:date name="birthDate" format="MMM dd, yyyy"/>)
            </td>
        </tr>
    </s:iterator>
    </table>
</div>
<s:debug/>
</body>
</html>
