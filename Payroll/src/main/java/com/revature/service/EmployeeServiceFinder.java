package com.revature.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.pojo.Employee;

@Service
public class EmployeeServiceFinder implements PayrollService{
	
	private static final String employeeURL="http://localhost:8080/EMSystemMain/employee";

	@Override
	public List<Employee> getAllEmployees() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		/*
		 * //ResponseEntity<List<FlashCard>> flashCardList = restTemplate.exchange
		//		(flashCardUrl, HttpMethod.GET, null, new ParameterizedTypeReference <List<FlashCard>> () {});
		
		FlashCard[] flashCards = restTemplate.getForObject(flashCardUrl, FlashCard[].class);
		
		//return flashCardList.getBody();
		
		return Arrays.asList(flashCards);
		 * */
		Employee[] employees=restTemplate.getForObject(employeeURL, Employee[].class);
		
		return Arrays.asList(employees);
	}

	@Override
	public List<Employee> getAllPayroll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getPayrollById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
