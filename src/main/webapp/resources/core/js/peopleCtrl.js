angular.module("peopleCtrl").controller("peopleCtrl",['$scope','peopleService',function($scope, peopleService) {
					$scope.list={};
			peopleService.createListFunction()
			.then(function(list)
			{
				$scope.list=list;
			
				console.log('list returned to controller.');
			},
			function(data)
			{
				console.log('list retrieval failed.');
			});
			
}]);
