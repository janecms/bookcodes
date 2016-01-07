<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<title>Div</title>
<sx:head/>
</head>
<body>
<sx:div 
        cssStyle="border:1px solid black;height:75px;width:100px"
        href="ServerTime.action" 
        updateFreq="2000"
        autoStart="false"
        startTimerListenTopics="startTimer"
        highlightColor="#ddaaba">
     Server time will be displayed here
</sx:div>
<s:submit theme="simple" value="Start timer" 
	onclick="dojo.event.topic.publish('startTimer')"
/>
</body>
</html>
