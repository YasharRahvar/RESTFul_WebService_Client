/**
 * Project: rest_project_client
 * File: EmployeeService.java
 * Date: Jul 24, 2017
 * Time: 4:11:27 PM
 * 
 */

package rest_project.service;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import rest_project.jpa.entity.ClientResponse;
import rest_project.jpa.entity.Employee;
import rest_project.jpa.entity.ResponseCode;

/**
 * @author Yashar Rahvar
 *
 */
public class EmployeeService implements EmployeeServiceInterface {

	private WebResource resource;

	public EmployeeService() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		resource = client.resource(getBaseURI());
		System.out.println(""):
	}

	@Override
	public List<Employee> getEmployeeList() {
		return resource.path("").accept(MediaType.APPLICATION_XML).get(new GenericType<List<Employee>>() {
		});
	}

	@Override
	public ClientResponse findEmployeeById(String id) {
		return resource.path("/find/" + id).accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
	}

	@Override
	public ResponseCode removeEmployee(String id) {
		return resource.path("/remove/" + id).accept(MediaType.APPLICATION_XML).get(ResponseCode.class);
	}

	@Override
	public ResponseCode addEmployee(Employee employee) {
		return resource.path("/add" ).
				type( MediaType.APPLICATION_XML ).
				accept(MediaType.APPLICATION_XML).put(ResponseCode.class, employee);
	}
	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/RESTtFul_Project/employee").build();
	}
}
