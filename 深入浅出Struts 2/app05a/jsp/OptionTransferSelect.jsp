<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>optiontransferselect Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style>
select {
    width:170px;
}
</style>
</head>
<body>
<div id="global" style="width:550px">
    <s:form>
        <s:optiontransferselect label="Select languages"
                name="allLanguages"
                leftTitle="All languages"
                rightTitle="Selected languages"
                list="{'French', 'Spanish', 'German', 
                        'Dutch', 'Mandarin', 'Cantonese'}"
                multiple="true"
                headerKey="headerKey"
                headerValue="--- Please Select ---"
                size="12"

                emptyOption="true"
                doubleList="{'English'}"
                doubleName="selectedLanguages"
                doubleHeaderKey="doubleHeaderKey"
                doubleMultiple="true"
                doubleSize="5"
        />
        <s:submit/>
	</s:form>
</div>
</body>
</html>
