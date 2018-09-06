<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Gradle + Spring MVC</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.0/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.0/angular-route.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="<c:url value="/resources/core/js/peopleServiceCreate.js" />"></script> 
<script src="<c:url value="/resources/core/js/peopleService.js" />"></script> 
<script src="<c:url value="/resources/core/js/peopleUpdateService.js" />"></script> 
<script src="<c:url value="/resources/core/js/studentCtrl.js" />"></script>
<script src="<c:url value="/resources/core/js/peopleCtrlCreate.js" />"></script>
<script src="<c:url value="/resources/core/js/peopleCtrl.js" />"></script>
<script src="<c:url value="/resources/core/js/studentDeleteCtrl.js" />"></script>
<script src="<c:url value="/resources/core/js/login.js" />"></script>
<script src="<c:url value="/resources/core/js/peopleDeleteService.js" />"></script>
<script src="<c:url value="/resources/core/js/peopleDeleteCtrl.js" />"></script>
<script src="<c:url value="/resources/core/js/peopleUpdateCtrl.js" />"></script>
 
</head>
<body >
<div class="container-fluid" ng-app="helloWorld">
<nav class="navbar navbar-default navbar-fixed-top" >
    <div class="navbar-header">
      <a class="navbar-brand" href="#people/view">DataCard</a>
    </div>
    <ul class="nav navbar-nav">
       
       <li><a href="#people/view">People List</a></li>
       <li><a href="#people/create">Create People</a></li>
      
    </ul>
</nav>
<br>
<br>
<br>
<br>
<br>
<br><br>
<div ng-view></div>
</div>
<script>

var mainApp = angular.module("helloWorld", ['ngRoute','createCtrl','deleteCtrl','peopleCtrl','loginCtrl','peopleDeleteCtrl','peopleUpdateCtrl','peopleCtrlCreate']);

mainApp.config(function($routeProvider) {
	$routeProvider
		.when('/', {
			disableCache: true,
			templateUrl: 'people/view',
			controller: 'peopleCtrl'
		})
		.when('/people/view', {
  	 		disableCache: true,
       		templateUrl : 'people/view' ,
      		controller: 'peopleCtrl'
		})
		.when('/people/create', {
    	 	disableCache: true,
     		templateUrl : 'people/create' ,
       		controller: 'peopleCtrlCreate'
		})
		.when('/people/data', {
    	 	disableCache: true,
     		templateUrl : 'people/data' ,
       		controller: 'peopleCtrl'
		})
		.when('/people/update', {
  	 		disableCache: true,
       		templateUrl : 'people/update' ,
      		controller: 'peopleUpdateCtrl'
		});
});

</script>

</body>
</html>