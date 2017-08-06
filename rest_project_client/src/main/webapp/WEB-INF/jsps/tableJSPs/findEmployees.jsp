<!-- 
Author: Yashar Rahvar
findEmployees JSP page 
This JSP is responsible to show the find employee table.
-->

<table class="employeeTable">
	<tr>
		<th class="tableTitles">Find An Employee By ID</th>
	</tr>
	<tr>
		<td>
			<form method="post" action="EmployeeServlet" onSubmit="return submitIt(this)">
				<b><label for="ID">ID: </label></b> 
				<input type="text" name="employeeID"><BR>
				<input type="hidden" name="action" value="service.findEmployee" />
				<input class="tableButtons" type="submit" name="findByID" value="Search" >
			</form>
		</td>
	</tr>
	
	</table>
	<p class="errorMessages"><strong>${findResponseCode.error}</strong></p>
	<p class="infoMessages"><strong>${employee.firstName} ${employee.lastName}</strong></p>
	<p class="infoMessages"><strong>${findResponseCode.code} ${findResponseCode.description}</strong></p>
