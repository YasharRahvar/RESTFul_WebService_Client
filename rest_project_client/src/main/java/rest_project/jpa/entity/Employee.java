/**
 * Project: rest_project_client
 * File: Employee.java
 * Date: Jul 19, 2017
 * Time: 10:19:25 PM
 */

package rest_project.jpa.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Yashar Rahvar
 *
 */
@XmlRootElement
public class Employee {

	private String id;
	private String firstName;
	private String lastName;
	private Date dob;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
	}

}
