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
<script src="<c:url value="/resources/core/js/studentCtrl.js" />"></script>
<script src="<c:url value="/resources/core/js/studentDeleteCtrl.js" />"></script>

</head>
<body >
<div class="container-fluid" ng-app="helloWorld">
<nav class="navbar navbar-default navbar-fixed-top" >
    <div class="navbar-header">
      <a class="navbar-brand" href="#">DataCard</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Student List</a></li>
      <li><a href="#create">Create</a></li>
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
var app = angular.module('helloWorld', ['ngRoute', 'createCtrl', 'deleteCtrl']);
app.config(['$routeProvider',  function($routeProvider) {
    $routeProvider
    .when('/', {
    	 disableCache: true,
        templateUrl : 'student/list' ,
        controller: 'studentDeleteCtrl'
    })
    .when('/create', {
        templateUrl : 'student/create',
        controller: 'studentCtrl'
    });
}]);
</script>

</body>
</html>