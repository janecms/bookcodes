<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>combobox Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style type="text/css">
td {
	vertical-align:top;
}
</style>
</head>
<body>
<div id="global" style="width:300px">
	<h3>Select Car Make</h3>
	<s:form>
		<s:combobox name="make" label="Car Make" size="24"
				headerKey="-1" headerValue="Select a make"
				list="{ 'Ford', 'Pontiac', 'Toyota'}" 
		/>
    	<s:submit/>

	</s:form>
</div>
</body>
</html>
