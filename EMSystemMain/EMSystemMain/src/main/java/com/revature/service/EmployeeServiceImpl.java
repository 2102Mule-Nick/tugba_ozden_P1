package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dao.EmployeeDao;
import com.revature.messaging.JmsMessageSender;
import com.revature.pojo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	
	private EmployeeDao employeeDao;
	
	private JmsMessageSender jmsMessageSender;	
	
	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Autowired
	public void setJmsMessageSender(JmsMessageSender jmsMessageSender) {
		this.jmsMessageSender = jmsMessageSender;
	}
	

	@Override
	//@Transactional
	public void createEmployee(Employee employee) {
		
		//control mail adresses
		employeeDao.createEmployee(employee);		
	}

	@Override
	public Employee getEmployeeByName(String employeeName) {
		
		return employeeDao.getEmployeeByName(employeeName);
		
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {		
		
		//System.out.println("All employees List\n");
		
		List<Employee> employeeList=employeeDao.getAllEmployees();
		jmsMessageSender.sendMessage("All employees list has been accessed.");
		
		return employeeList;
	}

	@Override
	//@Transactional
	public void updateEmployee(Employee employee) {
		
		
		
		employeeDao.updateEmployee(employee);
		
		jmsMessageSender.sendMessage("All employees list has been accessed.");
		
	}

	@Override
	public void removeEmployee(Employee employee) {
		if(employeeDao.removeEmployee(employee)) {
			System.out.println("This employee is removed successfuly..");
		}else System.out.println("Something went wrong..");
			
	}

	@Override
	public void countEmployeesByDepartment(int departmentId) {
		
		System.out.println("Employee counts : " + employeeDao.countEmployeesByDepartment(departmentId)+ 
				"in the "+ departmentId +" Id's department");
		}

	@Override
	public Employee getEmployeeById(int employeeId) {
		
		return employeeDao.getEmployeeById(employeeId);
		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeDao.deleteEmployee(employeeId);		
		
	}

	@Override
	//@Transactional
	public void isEmailAdressExist(String email) {
		employeeDao.isEmailAdressExist(email);
		 System.out.println("This email exist please enter different email!");
		
	}

}
