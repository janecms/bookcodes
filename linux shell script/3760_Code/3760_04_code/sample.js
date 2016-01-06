function sign_out()
{ 
	
	$( "#loading" ).show();
	$.get( "log_in", { logout : "True" },
	
	function () {

	      window.location="";
		
	});

/* 
this is a line of comment
*/
	

}

