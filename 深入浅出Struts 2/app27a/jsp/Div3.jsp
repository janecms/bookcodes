<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<title>Div</title>
<sx:head/>
<script type="text/javascript">
var counter = 1;
dojo.event.topic.subscribe("updateCounter", function(event, widget){
	dojo.byId("counter").innerHTML = 
            "The server has been hit " + counter++ + " times";
});
</script>
</head>
<body>
<sx:div 
        cssStyle="border:1px solid black;height:75px;width:100px"
        href="ServerTime.action" 
        updateFreq="2000"
        afterNotifyTopics="updateCounter"
        highlightColor="#ddaaba">
     Server time will be displayed here
</sx:div>
<div id="counter">
</div>




</body>
</html>
