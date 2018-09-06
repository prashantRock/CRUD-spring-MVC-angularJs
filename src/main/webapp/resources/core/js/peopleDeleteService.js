angular.module("peopleDeleteCtrl", [ 'helloWorld' ]).factory(
		"peopleDeleteService", [ '$http', '$q', function($http, $q) {
			return {
				DeleteService : function(id) {
					var def = $q.defer();
					$http({
						'url' : 'people/delete/' + id,
						'method' : 'DELETE'
					}).success(function(response) {
						/*createListFunction();
						var id_delete="name-"+id;
						$('#tblParticipantList > tr').eq(rowNum).children('td').remove();*/
						def.resolve(response);
					}).error(function() {
						def.reject("Failed to delete data");
					});
					return def.promise;

				}
			}
		} ]);