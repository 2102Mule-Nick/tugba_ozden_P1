package com.revature.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.revature.pojo.User;

@Component
public class UserExtractor implements ResultSetExtractor<User> {

	@Override
	public User extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		User user=new User();
		
		//employee.setEmployeeId(rs.getLong("employee_id"));
		
		user.setId(rs.getInt("user_id"));
		user.setFirstName(rs.getString("first_name"));
		user.setLastName(rs.getString("last_name"));
		user.setUserName(rs.getString("user_name"));
		user.setPassword(rs.getString("pass_word"));
		user.setEmail(rs.getString("email"));
		user.setRoleId(rs.getInt("role_id"));			
	
		return user;
	}
	
	

}
