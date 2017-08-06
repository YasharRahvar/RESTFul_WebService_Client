<!-- 
Author: Yashar Rahvar
logout JSP page 
This JSP is responsible to show the logout table.
-->
<table class="employeeTable">
	<tr>
		<th class="tableTitles">Sign Off</th>
	</tr>
	<tr>
		<td>
			<form method="post" action="LogoutServlet">
				<input class="tableButtons" type="submit" name="userRequest"
					value="Logout">
			</form>
		</td>
	</tr>
</TABLE>
