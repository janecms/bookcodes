<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Testing OGNL</title>
<style>
table {
    border-collapse: collapse; /* Collapse borders together */
    margin:10px;
}
table, td, th {
    border: 1px solid black;
}
</style>
</head>
<body>
<table>
<tr>
	<th colspan="3">Request Attributes</th>
</tr>
<tr>
	<th>Name</th>
	<th>Type</th>
	<th>Value</th>
</tr>
<%
	java.util.Enumeration attributeNames = request.getAttributeNames();
    while (attributeNames.hasMoreElements()) {
    	String attributeName = (String) attributeNames.nextElement();
    	Object attributeValue = request.getAttribute(attributeName);
    	out.println("<tr><td>" + attributeName + "</td>"
    			+ "<td>" + attributeValue.getClass() + "</td>" 
    			+ "<td>" + attributeValue + "</td></tr>");
    }
%>
</table>


<%    
    com.opensymphony.xwork2.util.ValueStack valueStack = 
    (com.opensymphony.xwork2.util.ValueStack) request.getAttribute("struts.valueStack");
%>
<table>
<tr>
	<th colspan="2">Value Stack Root</th>
</tr>
<tr>
	<th>Object Type</th>
	<th>Object Value</th>
</tr>
<%
	java.util.ArrayList root = valueStack.getRoot();
	int rSize = root.size();
	for (Object element : valueStack.getRoot()) {
		out.println("<tr><td>" + element.getClass() + "</td>" 
				+ "<td>" + element + "</td></tr>");
	}
%>
</table>
<table>
<tr>
	<td>Implementation class</td>
	<td><%=valueStack.getClass()%></td>
</tr>
</table>



<%
	java.util.Map context = valueStack.getContext();
	out.println("Context type:" + context.getClass());

%>
<table>
<tr>
	<th colspan="2">ValueStack Context</th>
</tr>
<tr>
	<th>Key</th>
	<th>Value</th>
</tr>
<%	
	for (Object key : context.keySet()) {
		out.println("<tr><td>" + key + "</td>");
		out.println("<td>" + context.get(key) + "</td></tr>");
	}
%>
</table>

<br/>
Text:<s:property value="text"/>
<br/>
Text:<s:property value="[0].text"/>

</body>
</html>
