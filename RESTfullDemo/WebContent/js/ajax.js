$(document).ready(function() { 
	$('#updateBtn').click(function(event) {
	        // get the form data
	        // there are many ways to get this data using jQuery (you can use the class or id also)
	        var formData = {
	            'day'               : $("input[name='day']").val(),
	            'month'             : $("input[name='month']").val(),
	            'year'    			: $("input[name='year']").val()
	        };
	
	        // process the form
	        $.ajax({
	            type        : 'PUT', // define the type of HTTP verb we want to use (POST for our form)
	            url         : 'rest/date/upd', // the url where we want to POST
	            data        : formData, // our data object
	            success		: function(result){
	            	$("#updStatus").html(result);
	            }
	        })
	            // using the done promise callback
	            .done(function(data) {
	
	                // log data to the console so we can see
	                console.log(data);
	
	                // here we will handle errors and validation messages
	            });
	
	        // stop the form from submitting the normal way and refreshing the page
	        event.preventDefault();
	    });
});