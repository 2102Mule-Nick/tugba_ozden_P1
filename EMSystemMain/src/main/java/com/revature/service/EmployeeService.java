package com.revature.service;

import java.util.List;

import com.revature.pojo.Employee;

public interface EmployeeService {
	

	public void createEmployee(Employee employee);
	
	public Employee getEmployeeByName(String employeeName);
	
	public List<Employee> getAllEmployees();
	
	public void updateEmployee(Employee employee);
	
	public void removeEmployee(Employee employee);
	
	public void countEmployeesByDepartment(int departmentId);
	
	public Employee getEmployeeById(int employeeId);
	
	public void deleteEmployee(int employeeId);	
	
	public void isEmailAdressExist(String email);


}
