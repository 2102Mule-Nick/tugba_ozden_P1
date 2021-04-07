package com.revature.pojo;

import java.util.List;

public class Department {
	
	private int departmentId;
	
	private String departmentName;
	
	private Long  locationId;
	
	private List<Employee> employees;//relation with employee //one employee can work just in a department

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String departmentName, Long locationId, List<Employee> employees) {
		super();
		this.departmentName = departmentName;
		this.locationId = locationId;
		this.employees = employees;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
	

}
