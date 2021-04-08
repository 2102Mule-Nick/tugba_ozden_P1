package com.revature.pojo;

import java.util.Date;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String hireDate;
	private int jobId;
	// An employee can work with one job.
	//an employee just can work in one departmant.	
	private int  departmentId;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}	
	
	public int getJobId() {
		return jobId;
	}




	public void setJobId(int jobId) {
		this.jobId = jobId;
	}




	public int getDepartmentId() {
		return departmentId;
	}




	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}




	
	public Employee(String firstName, String lastName, String email, String phoneNumber, String date, int jobId, int departmentId ) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = date;
		this.jobId=jobId;
		this.departmentId=departmentId;
	}
	

	public Employee(String firstName, String lastName, String email, String phoneNumber, String hireDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
	}
	
@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId
				+ ", departmentId=" + departmentId + "]";
	}
	
	

	

}
