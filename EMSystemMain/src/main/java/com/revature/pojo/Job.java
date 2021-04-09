package com.revature.pojo;

import java.util.List;

public class Job {
	
	private int jobId;
	private String jobTitle;
	private double minSalary;
	private double maxSalary;
	
	private List<Employee> employees;//

	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Job(String jobTitle, double minSalary, double maxSalary, List<Employee> employees) {
		super();
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.employees = employees;
	}

	public int getJobId() {
		return jobId;
	}

	
	public int getSalaryCalc(int paramInt) {
		
		
		
		return jobId;
	}
	
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	public double getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
	
	
	
	

}
