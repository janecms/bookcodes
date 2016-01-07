<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>subset Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:250px">
	<h4>Computers</h4>
    <s:generator id="computers" 
            val="%{'HP,Dell,Asus,Fujitsu,Toshiba'}"
            separator=",">
    </s:generator>

    <s:subset source="#attr.computers" decider="myDecider">
        <s:iterator>
            <s:property/>
        </s:iterator>
    </s:subset>

</div>
</body>
</html>
