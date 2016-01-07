var xmlHttpRequest;
var READY_STATE_UNINITIALIZED=0;
var READY_STATE_LOADING=1;
var READY_STATE_LOADED=2;
var READY_STATE_INTERACTIVE=3;
var READY_STATE_COMPLETE=4;

function getXMLHttpRequest() {
    xmlHttpRequest = null;
    if (!xmlHttpRequest) {
        if (window.XMLHttpRequest) {
            xmlHttpRequest = new XMLHttpRequest();
        } else if (window.ActiveXObject) {
            xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
        }
    }
    return xmlHttpRequest;
}

function sendRequest(handler, url) {
    url = url + "&r=" + Math.random();
    xmlHttpRequest = getXMLHttpRequest();
    if (xmlHttpRequest) {
        xmlHttpRequest.onreadystatechange = handler;
        xmlHttpRequest.open("GET", url, true);
        xmlHttpRequest.send(null);
    }
}

function populateSelectElement(select, options) {
	for (var i=0; i<options.length; i++) {
		var option = options[i];
		select.options[select.options.length] = new Option(option.text, option.value);
	}
}

function getSelectedIndex(select) {
	if (!select) return -1;
	var selectedIndex = -1;
	var length = select.options.length;
	for (var i=0; i<length; i++) {
		var option = select.options[i];
		if (option.selected) {
			selectedIndex = option.value;
		}
	}
	return selectedIndex;
}

function clearOptions(select) {
	if (select && select.options) {
		select.options.length = 0;
	}
}

function trim(s) {
    while (s.charAt(0) == ' ') {
        s = s.substring(1, s.length);
    }
    while (s.charAt(s.length - 1) == ' ') {
        s = s.substring(0, s.length - 1);
    }    
    return s;
}


function showElement(elementName, visible) {
	var element = document.getElementById(elementName);
	if (!element) return;
	if (visible) {
		element.style.visibility = "visible";
		element.style.display = "block";
	} else {
		element.style.visibility = "hidden";
		element.style.display = "none";
	}
}

function showNamedElement(elementName, visible) {
	var element = document.getElementById(elementName);
	if (!element) return;
	if (visible) {
		element.style.visibility = "visible";
		element.style.display = "block";
	} else {
		element.style.visibility = "hidden";
		element.style.display = "none";
	}
}

function isVisible(element) {
	if (!element) return false;
	return (element.style.visibility=="visible");
}

function setVisible(element, visible) {
	if (!element) return;
	if (visible) {
		element.style.visibility = "visible";
		element.style.display = "block";
	} else {
		element.style.visibility = "hidden";
		element.style.display = "none";
	}
}

// overcome limitation of the escape function, especially when a plus character is present
// from http://www.devx.com/tips/Tip/15091
function urlEncode(strValue) {
	var charValue,blnValidChar,charCodeValue;
	var strEncodedValue='';
	for(var i=0;i<strValue.length;i++) {
		blnValidChar=false;
		charValue=strValue.charAt(i);
		charCodeValue=strValue.charCodeAt(i);

		/* Ignore Enter here */
		if (charCodeValue!=13 && charCodeValue!=10) {
			var inValidCharacters=/[^a-zA-Z0-9]/
			blnValidChar=inValidCharacters.test(charValue);
			if(blnValidChar)
				strEncodedValue+="%" + charCodeValue.toString(16);
			else
				strEncodedValue+=charValue
		}
		else {
			/*	If Enter ie 13 don't do anything for 10 two chars are concatenated for single value
			*/
			if(charCodeValue!=10)
			strEncodedValue+=escape("\n")
		}
	}
	return strEncodedValue
}

