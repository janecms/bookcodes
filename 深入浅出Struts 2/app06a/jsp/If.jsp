<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>if Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:350px">
    <s:if test="#session.loggedIn == null">
        <h3>Login</h3>
        <s:form>
    	    <s:textfield name="userName" label="User Name"/>
    	    <s:password name="password" label="Password"/>
    	    <s:submit value="Login"/>
        </s:form>
    </s:if>
    <s:else>
    	Welcome <s:property value="userName"/>
    </s:else>
    
</div>
</body>
</html>
