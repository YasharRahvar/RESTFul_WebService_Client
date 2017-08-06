/**
 * Project: rest_project_client
 * File: AbstractCommand.java
 * Date: Jul 24, 2017
 * Time: 4:09:30 PM
 */

package rest_project.controller;

import javax.servlet.http.HttpServletRequest;

import rest_project.service.EmployeeService;
import rest_project.service.EmployeeServiceInterface;

/**
 * @author Yashar Rahvar
 *
 */
public abstract class AbstractCommand implements Command {

	protected EmployeeServiceInterface employeeService;

	public AbstractCommand() {
		employeeService = new EmployeeService();
	}

	@Override
	public abstract void execute(HttpServletRequest request);

}
