package com.revature.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.mapper.UserRowMapper;
import com.revature.pojo.User;

@Repository
public class UserDaoJDBCTemplate implements UserDao{
	
	
	private JdbcTemplate jdbcTemplate;

	private  UserRowMapper userRowMapper;	
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Autowired
	public void setUserRowMapper(UserRowMapper userRowMapper) {
		this.userRowMapper = userRowMapper;
	}
	
	@Override
	public User createUser(User user) {
		
		String sql="insert into users(first_name, last_name, user_name,email,pass_word,role_id) values(?,?,?,?,?,?)";
		
		this.jdbcTemplate.update(sql, 
				new Object[] {user.getFirstName(),user.getLastName(),user.getUserName(),user.getPassword(),
						user.getEmail(),user.getRoleId()});
		return user;
	}

	@Override
	public boolean updatedUser(User user) {
		String sql="update users set first_name=?,last_name=?, user_name=?, pass_word=?, email=?, role_id=? where user_id=?";
		
		this.jdbcTemplate.update(sql, new Object [] {
				user.getFirstName(),user.getLastName(),user.getUserName(),user.getPassword(),
				user.getEmail(),user.getRoleId(), user.getId()});
	
		return true;
	}

	@Override
	public boolean deleteUser(User user) {
		String sql="delete from users where user_id=?";
		
		if(this.jdbcTemplate.update(sql,user.getId())==0) {
			
			return false;			
		}		
		
		return true;
	}

	@Override
	public User findUserById(int id) {
		String sql="select u.user_id, u.first_name, u.last_name, u.user_name, u.pass_word,u.email, r.role_id  "
				+ " from users u left outer join roles r on (u.role_id=r.role_id) where u.user_id =?";
		
		List<User> userList=this.jdbcTemplate.query(sql, userRowMapper,id);
		
		return userList.get(0);
	}

	@Override
	public User findUserByUserName(String userName) {
		String sql="select u.user_id, u.first_name, u.last_name, u.user_name, u.pass_word,u.email,r.role_id  "
				+ " from users u left outer join roles r on (u.role_id=r.role_id) where u.user_name =?";
		
		List<User> userList=this.jdbcTemplate.query(sql, userRowMapper, userName);
		
		return userList.get(0);
		
	}

	@Override
	public User findUserByEmail(String email) {//gives errors
		
		String sql="select u.user_id, u.first_name, u.last_name, u.user_name, u.pass_word,u.email, r.role_id  "
				+ "from users u left outer join roles r on (u.role_id=r.role_id) where u.email =?";
		
		List<User> userList=this.jdbcTemplate.query(sql, userRowMapper, email);
		
		return userList.get(0);
		
		
	}

	@Override
	public List<User> findAllUsers() {
		String sql="select u.user_id, u.first_name, u.last_name, u.user_name, u.pass_word,u.email, r.role_id  "
				+ " from users u left outer join roles r on (u.role_id=r.role_id)";
		
		List<User> userList=this.jdbcTemplate.query(sql, userRowMapper);
		
		return userList;
		
	}
	
	

}
