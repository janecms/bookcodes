<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>select Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:300px">
	<h3>Select Location</h3>
	<s:form>
		<s:select name="country" label="Country" emptyOption="true"
				list="#application.countries" 
				onchange="this.form.submit()"
		/>
		<s:select name="city" label="City" 
				list="cities" listKey="id" listValue="name"
		/>
    	<s:submit/>

	</s:form>
</div>
</body>
</html>
