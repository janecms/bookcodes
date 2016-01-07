<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>textfield Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:150px">
	<h3>Login</h3>
	<s:form>
	    <s:hidden name="code" value="1"/>
    	<s:textfield name="userName" label="User Name"
    		tooltip="Enter User Name"
    		labelposition="top"
    	/>
    	<s:password name="password" label="Password"
    		tooltip="Enter Password"
    		labelposition="top"
    	/>
    	<s:submit value="Login"/>
	</s:form>
</div>
</body>
</html>