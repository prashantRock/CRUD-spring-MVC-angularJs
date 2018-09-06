angular.module("peopleUpdateCtrl").controller("peopleUpdateCtrl",['$scope','peopleUpdateService','peopleService',function($scope,peopleUpdateService,peopleService){
	$scope.peopleUpdate=function(){
		$scope.responseMessage={};
		var name=$('#modal-name').val();
		var age=$('#modal-age').val();
		var contact=$('#modal-contact').val();
		var id=$('#modal-id').val();
		var uniqueid=$('#modal-uniqueId').val();
		
		
		var nameReg = /^[A-Za-z]+$/;
	    var validName = nameReg.test(name);
	    var contactReg = /^\d{10}$/;
	    var validContact = contactReg.test(contact);
	    var ageReg = /^\d{2}$/;
	    var validAge=ageReg.test(age);
	      if (!validName) {
	        
	        alert("Enter a valid name");
	        $('#status').val(false);
	      }
	      if (!validAge) {
		      
		        alert("Enter a valid age");
		        $('#status').val(false);
		      }
	      if (!validContact) {
		      
		        alert("Enter a valid contact");
		        $('#status').val(false);
		      }
	var check=$('#status').val();

if(check==='true')
	{
		peopleUpdateService.UpdateService(name,age,contact,id)
		.then(function(response)
		{
			peopleService.createListFunction()
			.then(function(list)
			{
				$scope.list=list;
			})
			
		},
		function(data)
		{
			
		});
	}
	}
		$scope.populatePeopleData = function(id){
					
debugger;
console.log('your message');						
							var n_id="name-"+id;
							var c_id="contact-"+id;
							var a_id="age-"+id;
							
					$('#modal-name').val(document.getElementById(n_id).innerHTML);
					
					$('#modal-age').val(document.getElementById(a_id).innerHTML);
					$('#modal-contact').val(document.getElementById(c_id).innerHTML);
					$('#modal-id').val(id);
					 $('#status').val(true);
	
		}
		
	
}
]);




