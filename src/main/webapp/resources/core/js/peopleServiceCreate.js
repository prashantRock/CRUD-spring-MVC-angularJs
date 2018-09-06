angular.module("peopleCtrlCreate", [ 'helloWorld' ]).factory(
		"peopleServiceCreate", [ '$http', '$q', function($http, $q) {
			return {
				createPeopleRecords : function(name, age, contact) {
					responseMessage = {};
					var def = $q.defer();
					var peopleCO = {
						'name' : name,
						'age' : age,
						'contact' : contact
					};
					$http({
						'url' : 'people/create',
						'method' : 'POST',
						'headers' : {
							'Content-Type' : 'application/json'
						},
						'data' : JSON.stringify(peopleCO)
					}).success(function(response) {
						responseMessage = response;
						def.resolve(responseMessage);
					}).error(function() {
						def.reject("Failed to create data");
					});
					return def.promise;
				}
			}
} ]);