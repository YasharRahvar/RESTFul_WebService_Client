/**
 * Project: rest_project_client
 * File: DeleteEmployeeCommand.java
 * Date: Jul 24, 2017
 * Time: 8:40:19 PM
 */

package rest_project.controller;

import javax.servlet.http.HttpServletRequest;

import rest_project.jpa.entity.ResponseCode;

/**
 * @author Yashar Rahvar
 *
 */
public class DeleteEmployeeCommand extends AbstractCommand {

	@Override
	public void execute(HttpServletRequest request) {
		String employeeID = null;
		if (null != request.getParameter("employeeID") && request.getParameter("employeeID").length() != 0) {
			employeeID = request.getParameter("employeeID");
		}
		ResponseCode responseCode = employeeService.removeEmployee(employeeID);
		request.setAttribute("deleteResponseCode", responseCode);
	}

}
