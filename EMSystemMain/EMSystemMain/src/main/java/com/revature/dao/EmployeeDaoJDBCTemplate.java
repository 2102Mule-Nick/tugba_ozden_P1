package com.revature.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.mapper.EmployeeRowMapper;
import com.revature.mapper.JobRowMapper;
import com.revature.pojo.Department;
import com.revature.pojo.Employee;
import com.revature.pojo.Job;

@Repository
public class EmployeeDaoJDBCTemplate implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	private EmployeeRowMapper employeeRowMapper;

	//private JobRowMapper jobRowMapper;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Autowired
	public void setEmployeeRowMapper(EmployeeRowMapper employeeRowMapper) {
		this.employeeRowMapper = employeeRowMapper;
	}

	@Override //i  Can use all tables join in service part
	public void createEmployee(Employee employee) {
		String query = "insert into employee(first_name, last_name, email, phone, hiredate,job_id,department_id)values(?,?,?,?,?,?,?)";
		// jdbcTemplate.update(query, employeeRowMapper);

		this.jdbcTemplate.update(query,
				new Object[] { employee.getFirstName(), employee.getLastName(), employee.getEmail(),
						employee.getPhoneNumber(), employee.getHireDate(), employee.getJobId(),
						employee.getDepartmentId() });
		// System.out.println(employee);
	}

	@Override
	public Employee getEmployeeByName(String employeeName) {
		String sql = "select e.employee_id, e.first_name, e.last_name, e.email, e.phone, e.hiredate, j.job_id, d.department_id "
				+ "from employee e inner join job j  on (e.job_id=j.job_id) inner join department d on (e.department_id=d.department_id) "
				+ "where first_name = ?";

		// Object[] args = new Object[] {first_name};

		List<Employee> employeeList = jdbcTemplate.query(sql, employeeRowMapper, employeeName);

		// List<Employee> employeeList = jdbcTemplate.

		// System.out.println(employeeList);

		return employeeList.get(0);
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sql = "select e.employee_id, e.first_name, e.last_name, e.email, e.phone, e.hiredate, j.job_id, d.department_id "
				+ "from employee e inner join job j  on (e.job_id=j.job_id) inner join department d on (e.department_id=d.department_id) ";

		List<Employee> employeeList = jdbcTemplate.query(sql, employeeRowMapper);
		return employeeList;
	}

	@Override
	public void updateEmployee(Employee employee) {
		String sql = "update employee set first_name=?, last_name=?, email=?, phone=? where employee_id=? ";

		this.jdbcTemplate.update(sql, new Object[] { employee.getFirstName(), employee.getLastName(),
				employee.getEmail(), employee.getPhoneNumber(), employee.getEmployeeId() });

		// this.jdbcTemplate.up;
		System.out.println("Employee Id = " + employee.getEmployeeId() + " information updated.");
	}

	@Override
	public boolean removeEmployee(Employee employee) {
		String sql = "delete from employee where employee_id=?";

		if (this.jdbcTemplate.update(sql, employee.getEmployeeId()) == 0) {
			return false;
		}

		return true;
	}

	/*
	 * private boolean isEmailIdExists(String email) {
	 * 
	 *  String sql ="SELECT count(*) FROM table WHERE email = ?";
	 * 
	 * int count = jdbcTemplate.queryForObject(sql, new Object[] { email },
	 * Integer.class);
	 * 
	 * return count > 0; }
	 */
	@Override
	public boolean isEmailAdressExist(String email) {
		
		//String sql="Select count(*) from employee where email=?";
		//int count=jdbcTemplate.queryForObject(sql,new Object[] { email}, Integer.class);
		
		return jdbcTemplate.queryForObject("SELECT EXISTS(SELECT FROM employee WHERE email = ?)", Boolean.class, email);
		
	}

	
	
	@Override 
	 public int countEmployeesByDepartment(int departmentId) {
	 
	 String sql="select count(*) from employee where department_id=?";
	 int count=this.jdbcTemplate.queryForObject(sql,new Object[] {departmentId},Integer.class);
	 return count; 
	 
	 }


	@Override
	public Employee getEmployeeById(int employeeId) {
		String sql = "select e.employee_id, e.first_name, e.last_name, e.email, e.phone, e.hiredate, j.job_id, d.department_id "
				+ " from employee e inner join job j on (e.job_id=j.job_id) inner join department d on (e.department_id=d.department_id) "
				+ " where employee_id = ?";

		List<Employee> employeeList = jdbcTemplate.query(sql, employeeRowMapper, employeeId);

		return employeeList.get(0);

	}

	@Override
	public void deleteEmployee(int employeeId) {
		String sql = "delete from employee where employee_id=?";

		this.jdbcTemplate.update(sql, employeeId);

	}

}
