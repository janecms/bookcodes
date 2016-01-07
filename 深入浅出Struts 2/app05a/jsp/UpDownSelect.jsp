<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>updownselect Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style type="text/css">
select {
    width:100px;
}
</style>
</head>
<body>
<div id="global" style="width:250px">
	<h3>Favorite colors</h3>
    <s:form>
		<s:updownselect theme="ajax" name="colors" label="Colors" size="5"
    		list="#{'1':'Green', '2':'Red', '3':'Yellow'}" 
		/>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
