<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>radio Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:450px">
	<h3>Membership Form</h3>
	<s:form>
		<s:radio name="userType" label="User Type" 
				list="#{'1':'Individual', '2':'Organization'}"
		/>
		<s:radio name="incomeLevel" label="Income Level" 
				list="incomeLevels"
		/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
