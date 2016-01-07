<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>textfield Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:450px">
	<s:form>
    	<s:textarea name="description" label="Description"
    	        cols="35" rows="8"
    	/>
    	<s:reset/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>