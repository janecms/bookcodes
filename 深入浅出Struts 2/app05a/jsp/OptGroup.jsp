<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>optgroup Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:300px">
	<h3>Select City</h3>
	<s:form>
		<s:select name="city" label="City" emptyOption="true"
				list="usCities">
				
            <s:optgroup label="Canada" list="canadaCities"/>
            <s:optgroup label="Mexico" list="mexicoCities"/>

		</s:select>
    	<s:submit/>
	</s:form>
</div>
</body>
</html>
