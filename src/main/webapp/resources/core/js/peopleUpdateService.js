angular.module("peopleUpdateCtrl",['helloWorld'])
.factory("peopleUpdateService",['$http','$q',function($http,$q){
	return{
		UpdateService:function(name,age,contact,id) {
			responseMessage={};
			var def=$q.defer();
			var peopleUpdateData={'id':id,'name': name, 'age':age, 'contact':contact};
			$http({
				'url' : 'people/update',
				'method' : 'PUT',
				'headers' : {'Content-Type' : 'application/json'},
				'data' : JSON.stringify(peopleUpdateData)
			}).success(function(response) 
					{
				responseMessage = response.data;
				
					def.resolve(responseMessage);
				}).error(function()
						{def.reject("Failed to create data");
						});
				return def.promise;

				}
	
		}
}]);