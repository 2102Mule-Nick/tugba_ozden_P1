package com.revature.dao;

import java.util.List;

import com.revature.pojo.Employee;

public interface EmployeeDao {
	

	public void createEmployee(Employee employee);
	
	public Employee getEmployeeByName(String employeeName);
	
	public List<Employee> getAllEmployees();
	
	public void updateEmployee(Employee employee);
	
	public boolean removeEmployee(Employee employee);
	
	public int countEmployeesByDepartment(int departmentId);
	
	public Employee getEmployeeById(int employeeId);
	
	public void deleteEmployee(int employeeId);	
	
	public boolean isEmailAdressExist(String email);

	

}
