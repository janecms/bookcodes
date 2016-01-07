<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<title>Tree</title>
<sx:head debug="true"/>
<script type="text/javascript">
dojo.event.topic.subscribe("nodeSelected", function(source) {
	var selectedNode = source.node;
	alert("You selected node " + selectedNode.title);
});
</script>
</head>
<body>
<sx:tree rootNode="rootNode" 
	nodeTitleProperty="title" 
	nodeIdProperty="id"
	childCollectionProperty="children"
	selectedNotifyTopics="nodeSelected"
	>
</sx:tree>
</body>
</html>
