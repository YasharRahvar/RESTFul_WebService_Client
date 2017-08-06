/**
 * Project: rest_project_client
 * File: EmployeeServiceInterface.java
 * Date: Jul 24, 2017
 * Time: 4:11:36 PM
 */

package rest_project.service;

import java.util.List;

import rest_project.jpa.entity.ClientResponse;
import rest_project.jpa.entity.Employee;
import rest_project.jpa.entity.ResponseCode;

/**
 * @author Yashar Rahvar
 *
 */
public interface EmployeeServiceInterface {

	static final String EMP_ID_PATTERN="[A][0][0-9]{7}";
	List<Employee> getEmployeeList();
	ClientResponse findEmployeeById( String id );
	ResponseCode addEmployee( Employee employee );
	ResponseCode removeEmployee( String id );
}
