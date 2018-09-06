<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.0/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.0/angular-route.js"></script>
<script src="<c:url value="/resources/core/js/peopleServiceCreate.js" />"></script>
<div>

<body>
<div ng-controller="peopleCtrlCreate" class="container" >
<h2>Create People</h2>
  <form action="#" id="form_" >
    <div class="form-group">
      <label for="name">Name</label>
      <input type="text" class="form-control" ng-model="name" id="name" placeholder="Enter name" required >
    </div>
    <div class="form-group">
      <label for="age">age</label>
      <input type="text" class="form-control" ng-model="age" id="age" placeholder="Enter age">
    </div>
    <div class="form-group">
      <label for="contact">Contact</label>
      <input type="text" class="form-control" ng-model="contact" id="contact" placeholder="Enter contact"">
 <input type="hidden" class="form-control" ng-model="status" id="status" value="">
   
    </div>
	
    <input type="submit"  ng-click="createPeopleRecord()" class="btn btn-default"/>
  </form>
  </div>
  <div>{{responseMessage}}</div>
 
</body>  
 
  