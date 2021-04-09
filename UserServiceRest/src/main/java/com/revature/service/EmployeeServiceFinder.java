package com.revature.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.revature.pojo.Employee;

public class EmployeeServiceFinder  {
	
	private static final String employeeURL="http://localhost:8080/EMSystemMain/employee";
	
	
	/*public PurchaseOrder getPurchaseOrder(int purchaseId) {

		// allows a rest client to easily send a rest request
		RestTemplate restTemplate = new RestTemplate();

		return restTemplate.getForObject("http://localhost:8080/PurchaseService/purchase/" + purchaseId,
				PurchaseOrder.class);

	}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
		public List<Employee> getAllEmployees() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		
		Employee[] employees=restTemplate.getForObject(employeeURL, Employee[].class);
		
		return Arrays.asList(employees);
			}
	
	
	
	
	

}
