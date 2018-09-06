angular.module("peopleCtrl", [ 'helloWorld' ]).factory(
		"peopleService",
		[
				'$http',
				'$q',
				function($http, $q) {
					return {
						createListFunction : function() {
							var def1 = $q.defer();
							var createList = {};
							$http.get(
									"http://localhost:8080/spring/people/data")
									.success(function(response) {

										def1.resolve(response);
									}).error(function() {
										def.reject("Failed to get data");
									});
							return def1.promise;
						}

					}
				} ]);
