package com.revature.service;

import java.util.List;

import com.revature.pojo.Employee;

public interface PayrollService {
	
	public List<Employee> getAllEmployees();
	
	public List<Employee> getAllPayroll();
	
	public Employee getPayrollById(int employeeId);

}
