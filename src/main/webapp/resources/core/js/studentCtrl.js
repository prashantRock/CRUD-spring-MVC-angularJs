angular.module("createCtrl", []).controller("studentCtrl", ['$scope', '$http', function($scope, $http) {
	$scope.createStudentRecord = function () {
		var studentCO = {'firstName':$scope.first_name,'lastName':$scope.last_name , 'emailId':$scope.email_id};
		$http({
			'url' : 'student/create',
			'method' : 'POST',
			'headers': {'Content-Type' : 'application/json'},
			'data' :  JSON.stringify(studentCO)
		})
		.then(function successCallback(response){
			$scope.responseMessage = response.data.message
		}, function errorCallback(response){
		});
	}
}]);