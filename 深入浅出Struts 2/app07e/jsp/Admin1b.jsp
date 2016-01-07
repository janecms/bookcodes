<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Design Details</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
.errorMessage {
    color:red;
}
</style>
</head>
<body>
<div id="global" style="width:450px">
	<h4>Add Employees</h4>
	<s:fielderror/>
	<s:form theme="simple" action="Admin2">
	    <table>
	    <tr>
	        <th>First Name</th>
	        <th>Last Name</th>
	        <th>Birth Date</th>
	    </tr>
        <s:iterator value="new int[4]" status="stat">
            <tr>
                <td><s:textfield name="%{'employees['+#stat.index+'].firstName'}"/></td>
                <td><s:textfield name="%{'employees['+#stat.index+'].lastName'}"/></td>
                <td><s:textfield name="%{'employees['+#stat.index+'].birthDate'}"/></td>
            </tr>	        
        </s:iterator>
        <tr>
            <td colspan="3"><s:submit/></td>
        </tr>
        </table>	    
	</s:form>
</div>
</body>
</html>
