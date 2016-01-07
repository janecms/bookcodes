<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>doubleselect Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
select {
    width:170px;
}
</style>
</head>
<body>
<div id="global" style="width:300px">
    <s:form>
        <s:doubleselect label="Select Location" 
            name="country" 
            list="{'US', 'Canada', 'Mexico'}" 
            doubleName="city" 
            doubleList="top == 'US' ? 
                    {'Atlanta', 'Chicago', 'Detroit'} 
                : (top == 'Canada' ? 
                    {'Vancouver', 'Toronto', 'Montreal'}
                : {'Mexico City', 'Tijuana'})" 
        />
  
        <s:submit/>
	</s:form>
</div>
</body>
</html>
