<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<title>Bind</title>
<sx:head/>
</head>
<body>
<div id="div1"/>
<s:submit theme="simple" type="submit" value="submit" id="button"/>
<sx:bind id="ex1" href="ServerTime.action" 
    sources="button" 
    targets="div1" 
    events="onclick"/>


<input id="b2" type="button">
<sx:bind 
    id="binder2"
    beforeNotifyTopics="myTopic" 
    sources="b2" 
    events="onclick"/>

</body>
</html>
