package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.Employee;
import com.revature.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	/*
	 * public void createEmployee(Employee employee);
	
	public Employee getEmployeeByName(String employeeName);
	
	public List<Employee> getAllEmployees();
	
	public void updateEmployee(Employee employee);
	
	public void removeEmployee(Employee employee);
	
	public void countEmployeesByDepartment(int departmentId);
	
	public Employee getEmployeeById(int employeeId);
	
	public void deleteEmployee(int employeeId);	
	
	public void isEmailAdressExist(String email);

	 */
	
	@GetMapping("/employee")
	@ResponseBody
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{name}")
	@ResponseBody
	public Employee getEmployeeByName(@PathVariable String name) {
		return employeeService.getEmployeeByName(name);		
				
	}
	
	@GetMapping("/employee_id/{id}")
	@ResponseBody
	public Employee getEmployeeById(@PathVariable int id) {
		
		
		return employeeService.getEmployeeById(id);	
				
	}
	
	@PutMapping("/employee")
	@ResponseBody
	public String updateOneEmployee(@RequestBody Employee employee) {
		System.out.println("Updating employee");
		
		employeeService.createEmployee(employee);
		
		return "Empyolee update successfully";
	}
	
	@GetMapping("/employee-count/{id}")
	@ResponseBody
	public void countEmployeesByDepartment(@PathVariable int id) {
		
		 employeeService.countEmployeesByDepartment(id);
		
	}
	
	
	
	
	
	
	

}
