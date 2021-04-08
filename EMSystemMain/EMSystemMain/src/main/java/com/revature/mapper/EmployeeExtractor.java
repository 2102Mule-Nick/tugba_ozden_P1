package com.revature.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.revature.pojo.Employee;
import com.revature.pojo.Job;

@Component
public class EmployeeExtractor implements ResultSetExtractor<Employee>{

	@Override
	public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		Employee employee = new Employee();
		
		employee.setEmployeeId(rs.getInt("employee_id"));
		employee.setFirstName(rs.getString("first_name"));
		employee.setLastName(rs.getString("last_name"));
		employee.setEmail(rs.getString("email"));
		employee.setPhoneNumber(rs.getString("phone"));
		employee.setHireDate(rs.getString("hireDate"));
		employee.setJobId(rs.getInt("job_id"));
		employee.setDepartmentId(rs.getInt("department_id"));
		
		return employee;
	}

}
