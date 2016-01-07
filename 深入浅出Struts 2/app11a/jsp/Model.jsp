<%
	String make = request.getParameter("make");
	if (make.equals("1")) {
		String options = "[{value:21,text:'Caravan'}, {value:33,text:'Grand Caravan'}]";
		out.println(options);
	} else if (make.equals("2")) {
		String options = "[{value:21,text:'Santa Fe'}, {value:33,text:'Accent'}]";
		out.println(options);
	
	} else if (make.equals("3")) {
		String options = "[{value:21,text:'Altima'}, {value:33,text:'Maxima'}]";
		out.println(options);
	
	}
%>