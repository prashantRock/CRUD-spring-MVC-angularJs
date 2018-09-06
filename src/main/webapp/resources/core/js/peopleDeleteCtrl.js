angular.module("peopleDeleteCtrl").controller("peopleDeleteCtrl",['$scope','peopleDeleteService','peopleService',function($scope, peopleDeleteService,peopleService) {
					$scope.peopleDelete = function(id_delete) {
						var id = id_delete;
						peopleDeleteService.DeleteService(id)
						.then(function successCallback(response) {
							peopleService.createListFunction()
							.then(function(list)
							{
								$scope.list=list;
							})
								}, function errorCallback(response) {
								});
					}
					/*$(document).ready(function() {

						$("#tbUser").on('click', '.btnDelete', function() {
							$(this).closest('tr').remove();
						});
					});*/
				} ]);