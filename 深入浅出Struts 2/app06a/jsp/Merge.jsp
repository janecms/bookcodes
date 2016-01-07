<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>merge Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:250px">
	<h3>All cars</h3>
	<s:merge id="cars">
	    <s:param value="%{americanCars}"/>
	    <s:param value="%{europeanCars}"/>
	    <s:param value="%{japaneseCars}"/>
	</s:merge>
	<ul>
	<s:iterator value="%{#cars}">
	    <li><s:property/></li>
	</s:iterator>
	</ul>
</div>
</body>
</html>
