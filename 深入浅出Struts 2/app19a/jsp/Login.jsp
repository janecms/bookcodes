<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Login with CAPTCHA</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
    <h3>Enter your user name, password, and the image word</h3>
    <s:actionerror/>
    <s:form action="Login">
        <s:textfield name="userName" label="User Name"/>
        <s:password name="password" label="Password"/>
        <tr>
            <td><img src="GetCaptchaImage.action"/></td>
            <td><s:textfield theme="simple" name="word" value=""/></td>
        </tr>
        <s:submit value="Login"/>
    </s:form>
</div>
</body>
</html>
