/**
 * Project: rest_project_client
 * File: AddEmployeeCommand.java
 * Date: Jul 24, 2017
 * Time: 11:03:28 PM
 */

package rest_project.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import rest_project.jpa.entity.Employee;
import rest_project.jpa.entity.ResponseCode;
import rest_project.presentationUtil.PresentationUtility;

/**
 * @author Yashar Rahvar
 *
 */
public class AddEmployeeCommand extends AbstractCommand {

	@Override
	public void execute(HttpServletRequest request) {

		Employee employee = new Employee();
		employee.setId(request.getParameter("employeeID"));
		employee.setFirstName(request.getParameter("employeeFirstName"));
		employee.setLastName(request.getParameter("employeeLastName"));
		try {
			employee.setDob(getDob(request.getParameter("employeeDOB")));
		} catch (ParseException pe) {
			ResponseCode responseCode = new ResponseCode();
			responseCode.setError(PresentationUtility.getString("error.add.employee.invalidDate.desc"));
			request.setAttribute("addResponseCode", responseCode);
			return;
		}
		request.setAttribute("addResponseCode", employeeService.addEmployee(employee));
	}

	private Date getDob(String dob) throws ParseException {
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		return format.parse(dob);
	}
}
