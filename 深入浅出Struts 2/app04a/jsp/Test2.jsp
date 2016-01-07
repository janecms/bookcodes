<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Testing OGNL</title>
</head>
<body>
<h3>Reading Properties</h3>
    <s:property value="greeting"/>
    <s:property value="[1].greeting"/>
<br/>
<br/><s:property value="#application.code"/>
<br/><s:property value="#application['code']"/>
<br/><s:property value='#application["code"]'/>
<br/><s:property value="#parameters.id"/>
<br/><s:property value="[0].time"/>
<br/><s:property value="[0]['time']"/>
<br/><s:property value='[0]["time"]'/>

<hr/>
<h3>Invoking Fields and Methods</h3>
Static field: <s:property value="@java.util.Calendar@DECEMBER"/>
<br/>Field: <s:property value="[0].datePattern"/>
<br/>Static method: <s:property value="@app04a.Util@now()"/>
<br/>[0].now(): <s:property value="[0].now()"/>
<br/>@vs@now(): <s:property value="@vs@now()"/>
<br/>2-argument method: ([0].repeat(3, 'Hello')) <s:property value='[0].repeat(3, "Hello")'/>
<hr/>
<h3>Working with arrays and Lists</h3>
<br/><s:property value="colors"/>
<br/>First color: <s:property value="colors[0]"/>
<br/>Second color: <s:property value="colors[1]"/>
<br/>Array length: <s:property value="colors.length"/>

<br/><s:property value="countries"/>
<br/>First country: <s:property value="countries[0]"/>
<br/>Second country: <s:property value="countries[1]"/>
<br/>List size: <s:property value="countries.size"/>
<br/>List size: <s:property value="countries.size()"/>
<br/>isEmpty: <s:property value="countries.isEmpty"/>
<br/>isEmpty: <s:property value="countries.isEmpty()"/>
<br/>Create a string and display the first element: 
	<s:property value='{"Alaska", "California", "Washington"}[0]'/>

<hr/>
<h3>Working with Maps</h3>
Cities: <s:property value="cities"/>
<br/>City with index "CA": <s:property value='cities["CA"]'/>
<br/>City with index 'WA': <s:property value="cities['WA']"/>
<br/>Map size: <s:property value="cities.size"/>
<br/>Map size: <s:property value="cities.size"/>
<br/>isEmpty: <s:property value="cities.isEmpty"/>
<br/>isEmpty: <s:property value="cities.isEmpty()"/>
<br/>#application['code']: <s:property value="#application['code']"/>
<br/>Host:    <s:property value="#request.getHeader('host')"/>

<hr/>
<h3>Setting Property Values</h3>
Greeting:<s:property value="greeting"/>
 
</body>
</html>
