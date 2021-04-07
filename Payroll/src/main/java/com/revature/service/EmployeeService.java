package com.revature.service;

import java.util.List;

import com.revature.pojo.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public List<Employee> getAllPayroll();
	
	public Employee getPayrollById(int employeeId);

}
