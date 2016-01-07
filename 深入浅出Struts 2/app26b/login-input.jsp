<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Login</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:400px">
    <h3>Enter your user name and password</h3>
    <s:form action="login.action">
        <s:textfield name="userName" label="User Name"/>
        <s:password name="password" label="Password"/>
        <s:submit value="Login"/>
    </s:form>
</div>
</body>
</html>
