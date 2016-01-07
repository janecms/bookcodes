<html>
<head>
<title>AJAX test</title>
<script type="text/javascript" src="js/ajax.js"></script>
<script type="text/javascript">
function getModels() {
	// delete model options
	clearOptions(document.vehicleForm.model);
	var selectedIndex = getSelectedIndex(document.vehicleForm.make);
	if (selectedIndex > 0) {
		var url = "carModel.action?make=" + selectedIndex;
		sendRequest(getModelsHandler, url);
	}
}

function getModelsHandler(response) {
	var ready = xmlHttpRequest.readyState;
	if (ready == READY_STATE_COMPLETE){
		var options = eval(xmlHttpRequest.responseText);
		var select = document.vehicleForm.model;
		populateSelectElement(select, options);
	} 
}

</script>

</head>
<body>
<form name="vehicleForm">
	<select name="make" onchange="getModels()">
		<option value="0">[Select a make]</option>
		<option value="1">Dodge</option>
		<option value="2">Hyundai</option>
		<option value="3">Nissan</option>
	</select>
	<br/>
	<select name="model">
	</select>

</body>
</html>