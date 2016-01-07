<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>sort Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global" style="width:250px">

    <h4>Computers</h4>
    <s:generator id="computers" 
            val="%{'HP,Dell,Asus,Fujitsu,Toshiba'}"
            separator=",">
        <s:sort comparator="myComparator">
            <s:iterator>
                <s:property/>
            </s:iterator>
        </s:sort>
    </s:generator>
    <hr/>
    <h4>Cameras</h4>
    <s:generator id="cameras" 
            val="%{'Canon,Nikon,Pentax,FujiFilm'}"
            separator=",">
    </s:generator>
    <s:sort source="#attr.cameras" id="sortedCameras" 
            comparator="myComparator">
    </s:sort>
    <s:iterator value="#attr.sortedCameras">
        <s:property/>
    </s:iterator>
</div>
</body>
</html>
