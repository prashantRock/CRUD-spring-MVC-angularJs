<div ng-controller="login" class="container"  ng-init="tagStatus='false'">

<h2>Create People</h2>
  <form method="post">
    <div class="form-group">
      <label for="name">Name</label>
      <input type="text" class="form-control" ng-model="name" name="name" placeholder="Enter name" required>
    </div>
    <div class="form-group">
      <label for="age">age</label>
      <input type="text" class="form-control" ng-model="age" name="age" placeholder="Enter age">
    </div>
    
    <button type="submit" ng-click="login()" class="btn btn-default">Login</button>
  </form>
  </div>