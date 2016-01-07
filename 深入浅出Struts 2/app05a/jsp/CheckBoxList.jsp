<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>checkboxlist Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:450px">
	<h3>Select Interests</h3>
	<s:form>
		<s:checkboxlist name="interests" label="Interests" 
				list="interestOptions" 
				listKey="id" listValue="description"
		/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
