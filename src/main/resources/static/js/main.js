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
	
	$('form').submit(function(e){
		e.preventDefault();
		var astartTime;
		var aendTime;
		var acampus;
		var abuilding;
		
		acampus = $('select#campus option:selected').val();
		abuilding = $("select#building option:selected").val();
		astartTime = $('select#startTime option:selected').val();
		aendTime = $('select#endTime option:selected').val();
//		console.log(campus + " " + building + " " + startTime + " " + endTime)
		console.log("Do ajax request");
		$.ajax({

			dataType: "text",
			  url: "api/test",
			  data: {campus : acampus, building : abuilding, startTime : astartTime, endTime : aendTime}
			})
			  .done(function( data ) {	
				  var blah = data;
				console.log(data + "awdwad");			    
			    console.log("Done");
			    var json = JSON.parse(blah);
			    console.log(json);
		});
		
	});
	
	
	
	
	
});