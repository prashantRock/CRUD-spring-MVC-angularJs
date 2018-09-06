<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.0/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.0/angular-route.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<div class="container" ng-controller="peopleCtrl">
		<div ng-controller="peopleDeleteCtrl">
			<div ng-controller="peopleUpdateCtrl">
				<h2>People Table</h2>

				<table class="table" id="tbUser">
					<thead>
						<tr>
							<th>Name</th>
							<th>Age</th>
							<th>Contact</th>
							<!-- <th>ID</th> -->
							<th>Delete</th>
							<th>Update</th>

						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="list in list" id="{{list.id}}">
							<td ng-attr-id="{{'name-'+list.id}}">{{list.name}}</td>
							<td ng-attr-id="{{'age-'+list.id}}">{{list.age}}</td>
							<td ng-attr-id="{{'contact-'+list.id}}">{{list.contact}}</td>
							<td><a ng-click="peopleDelete(list.id)"
								class="btn btn-danger btnDelete">Delete</a></td>

							<td><button type="button" class="btn btn-info open-modal"
									ng-click="populatePeopleData(list.id)" data-toggle="modal"
									data-target="#myModal" id="{{list.id}}">Open Modal</button></td>
						</tr>

						<div class="modal fade" id="myModal" role="dialog">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<h4 class="modal-title">Modal Header</h4>

										<br> Name : &nbsp <input type="text" id="modal-name"
											name="name" ng-model="name"><br> <input
											type="hidden" name="id" id="modal-id" ng-model="id" value="">
										<input type="hidden" name="uniqueId" id="modal-uniqueId"
											ng-model="uniqueId" value=""> <br> Age :
										&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="age"
											id="modal-age" ng-model="age"><br> <br>
										Contact: <input type="text" name="contact" id="modal-contact"
											ng-model="contact"><br> <br>
											<input type="hidden" class="form-control" ng-model="status" id="status_update" value="">
											 <a
											ng-click="peopleUpdate()" data-dismiss="modal"
											class="btn btn-danger " id="clicked">Submit</a>
					</tbody>
				</table>
			</div>
			
</body>
</html>











