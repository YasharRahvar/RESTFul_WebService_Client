<!-- 
Author: Yashar Rahvar
AddEmployee JSP page 
This JSP is responsible to show the add employee table.
-->
<html>
<head>
<script type="text/javascript" src="resources/js/formValidation.js"></script>
</head>
<body>
	<table class="employeeTable">
		<tr>
			<th class="tableTitles">Add Employees</th>
		</tr>
		<tr>
			<td>
				<form method="POST" action="EmployeeServlet"
					onSubmit="return submitIt(this)">
					<b><label for="employeeID">ID: </label></b> <input type="text"
						name="employeeID"><br> <b><label
						for="employeeFirstName">First Name:</label></b> <input type="text"
						name="employeeFirstName"><br> <b><label
						for="employeeLastName">Last Name:</label></b> <input type="text"
						name="employeeLastName"><br> <b><label
						for="employeeDOB">DOB:</label></b> <input type="text"
						name="employeeDOB" placeholder="YYYY/MM/DD"><br> <input
						type="hidden" name="action" value="service.addEmployee" /> 
						<input class="tableButtons" type="submit" name="addNewEmployee" value="Add">
				</form>
			</td>
		</tr>
	</table>
	<p class="errorMessages">
		<strong>${addResponseCode.error}</strong>
	</p>
	<p class="infoMessages">
		<strong>${addResponseCode.code} ${addResponseCode.description}</strong>
	</p>
</body>
</html>