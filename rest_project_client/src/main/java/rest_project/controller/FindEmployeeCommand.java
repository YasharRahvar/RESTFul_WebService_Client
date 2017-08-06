/**
 * Project: rest_project_client
 * File: FindEmployeeCommand.java
 * Date: Jul 24, 2017
 * Time: 5:20:38 PM
 */

package rest_project.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import rest_project.jpa.entity.ClientResponse;

/**
 * @author Yashar Rahvar
 *
 */
public class FindEmployeeCommand extends AbstractCommand {

	Logger logger = Logger.getLogger(FindEmployeeCommand.class);
	@Override
	public void execute(HttpServletRequest request) {
		String employeeID = null;
		if(null!= request.getParameter("employeeID") && request.getParameter("employeeID").length() != 0){
			employeeID = request.getParameter("employeeID");
		}
		ClientResponse clientResponse = employeeService.findEmployeeById(employeeID);
		request.setAttribute("employee", clientResponse.getEmployee());
		request.setAttribute("findResponseCode", clientResponse.getResponseCode());;
	}

}
