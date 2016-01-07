<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>checkbox Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:300px">
	<h3>Subscription Type</h3>
	<s:form>
		<s:checkbox name="daily" label="Daily news alert"/>
		<s:checkbox name="weekly" label="Weekly reports"/>
		<s:checkbox name="monthly" label="Monthly reviews"
		    value="true" disabled="true"
		/>
    	<s:submit/>

	</s:form>
</div>
</body>
</html>
