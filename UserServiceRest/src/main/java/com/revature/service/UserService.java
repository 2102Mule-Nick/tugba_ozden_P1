package com.revature.service;

import java.util.List;

import com.revature.pojo.User;
import com.revature.ws.Article;

public interface UserService {
	
	public User registerNewUser(User user);//I am going to create UserDto for validation and serialization	
	
	public void checkIfValidOldPassword(User user, String oldPassword);
	
	public void changeUserPassword(User user, String password);
	
	public void  saveUser(User user);
	
	public void updatedUser(User user);
	
	public void deleteUser(User user);
	
	public User findUserById(int id);
	
	public User findUserByUserName(String userName);
	
	public User findUserByEmail(String email);
	
	public List<User> findAllUsers();
	
	
	
	
}