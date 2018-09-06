angular.module("peopleCtrlCreate").controller("peopleCtrlCreate",['$scope','peopleServiceCreate',function($scope, peopleServiceCreate) {
	
	$scope.createPeopleRecord=function()
	{
		 $('#status').val(true);
		    var name = $('#name').val();
		    var age = $('#age').val();
		    var contact = $('#contact').val();
		    var nameReg = /^[A-Za-z]+$/;
		    var validName = nameReg.test(name);
		    var contactReg = /^\d{10}$/;
		    var validContact = contactReg.test(contact);
		    var ageReg = /^\d{2}$/;
		    var validAge=ageReg.test(age);
		      if (!validName) {
		        $('#name').after('<span class="error">Enter a valid name</span>');
		        $('#status').val(false);
		      }
		      if (!validAge) {
			        $('#age').after('<span class="error">Enter a valid age</span>');
			        $('#status').val(false);
			      }
		      if (!validContact) {
			        $('#contact').after('<span class="error">Enter a valid contact</span>');
			        $('#status').val(false);
			      }
		var check=$('#status').val();
	$scope.responseMessage={};
	if(check==='true')
		{
	peopleServiceCreate.createPeopleRecords($scope.name,$scope.age,$scope.contact)
	.then(function(response)
	{
		$scope.responseMessage=response.message;
		alert("Data saved successfully");
		console.log('list returned to controller_create.');
	},
	function(data)
	{
		console.log('list retrieval failed_create.');
	});
	}
	}
	
}]);