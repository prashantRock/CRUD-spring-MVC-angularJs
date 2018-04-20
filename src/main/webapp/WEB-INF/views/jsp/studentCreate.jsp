<div  ng-controller="studentCtrl"  class="container" ng-init="tagStatus='false'">
  <h2>Create Student</h2>
  <form>
    <div class="form-group">
      <label for="fname">First name</label>
      <input type="text" class="form-control" ng-model="first_name" placeholder="Enter first name" required>
    </div>
    <div class="form-group">
      <label for="pwd">Last name</label>
      <input type="text" class="form-control" ng-model="last_name" placeholder="Enter last name">
    </div>
    <div class="form-group">
      <label for="emailId">Email Id</label>
      <input type="text" class="form-control" ng-model="email_id" placeholder="Enter email">
    </div>
	
    <button type="submit" ng-click="createStudentRecord()" class="btn btn-default">Create</button>
  </form>
  <h4>{{responseMessage}}</h4>
</div>
