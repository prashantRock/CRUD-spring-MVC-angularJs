angular.module("peopleUpdateCtrl",['helloWorld'])
.factory("peoplePopulateService",['$http',function($http){
	return{
		updatePopulateData:function(id) {
			
			var n_id="name-"+id;
			var c_id="contact-"+id;
			var a_id="age-"+id;
			$('#modal-name').val(document.getElementById(n_id).innerHTML);
			
			$('#modal-age').val(document.getElementById(a_id).innerHTML);
			$('#modal-contact').val(document.getElementById(c_id).innerHTML);
			$('#modal-id').val(id);
			}
		}
	}]);
	