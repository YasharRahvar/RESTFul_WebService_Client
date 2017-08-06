<!-- 
Author: Yashar Rahvar
deleteEmployees JSP page 
This JSP is responsible to show the delete employee table.
-->
<table class="employeeTable">
	<tr>
		<th class="tableTitles">Remove An Employee</th>
	</tr>
	<tr>
		<td>
			<form method="POST" action="EmployeeServlet">
				<b><label for="ID">ID:</label></b>
				<input type="text" name="employeeID"><BR>
				<input type="hidden" name="action" value="service.deleteEmployee" />
				<input class="tableButtons" type="submit" name="deleteByID" value="Delete">
			</form>
		</td>
	</tr>
	
	</table>
	<p class="errorMessages"><strong>${deleteResponseCode.error}</strong></p>
	<p class="infoMessages"><strong>${deleteResponseCode.code} ${deleteResponseCode.description}</strong></p>
