angular.module("loginCtrl", ['helloWorld']).controller("login", ['$scope', '$http', function($scope, $http) {
	$scope.login = function () {
		var peopleCO = {'name':$scope.name,'age':$scope.age };
		$http({
			'url' : 'people/login',
			'method' : 'POST',
			'headers': {'Content-Type' : 'application/json'},
			'data' :  JSON.stringify(peopleCO)
		})
		.then(function successCallback(response){
			$scope.responseMessage = response.data.message
		}, function errorCallback(response){
		});
	}
}]);