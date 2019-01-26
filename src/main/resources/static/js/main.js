$(document).ready(function(){
	
	console.log('Hello World');
	
	const campus = ["Sir George Williams", "Loyola"]
	const sgwBuildings = ["FG", "Hall", "JMSB"]
	const loyBuildings = ["CJ", "FC", "PY", "SP", "VE"]
	console.log(campus);
	
	$("#campus").change(function(e){
		console.log(this.value);
		$('#building')
	    .empty()
		if (this.value == "loy")
		{
			$.each(loyBuildings, function(key, value){
				console.log("Key: " + key)
				console.log("Val: " + value)	
				$("#building").append("<option value='" + value + "'>" + value + " Building" + "</option>");
			})
		}		
		else
		{
			$.each(sgwBuildings, function(key, value){
				console.log("Key: " + key)
				console.log("Val: " + value)	
				$("#building").append("<option value='" + value + "'>" + value + " Building" + "</option>");
			})
		}
		
	});
	
	
	
	
	
});