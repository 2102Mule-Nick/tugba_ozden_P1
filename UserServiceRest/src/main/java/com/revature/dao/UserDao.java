package com.revature.dao;

import java.util.List;

import com.revature.pojo.User;

public interface UserDao {
	
	public User createUser(User user);
	
	public boolean updatedUser(User user);
	
	public boolean deleteUser(User user);
	
	public User findUserById(int id);
	
	public User findUserByUserName(String userName);
	
	public User findUserByEmail(String email);
	
	public List<User> findAllUsers();	

}
