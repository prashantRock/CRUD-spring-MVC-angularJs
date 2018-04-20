<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container"  ng-controller="studentDeleteCtrl">
	<h2>Student List</h2>
	<table class="table">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listStudentRecord}" var="listStudent">
				<tr>
					<td>${listStudent.fname}</td>
					<td>${listStudent.lname}</td>
					<td>${listStudent.emailId}</td>
					<td>
						<button type="submit" ng-click="createStudentRecord()"
							class="btn btn-warning">Update</button>
					</td>
					<td>
						<button ng-click="open()"
							class="btn btn-danger">Delete</button>
					</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<modal title="Are u sure u want to delete this record???" visible="showModal">
	<form role="form"></form>
	</modal>

</div>


