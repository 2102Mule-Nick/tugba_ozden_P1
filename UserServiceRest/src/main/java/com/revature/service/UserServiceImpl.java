package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.UserDao;
import com.revature.exception.UserExistException;
import com.revature.pojo.User;
import com.revature.ws.Article;
import com.revature.ws.ArticleService;
import com.revature.ws.ArticleServiceImplService;

@Service
public class UserServiceImpl implements UserService{
	
	private UserDao userDao;	
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	

	@Override
	public User registerNewUser(User user) {
		
		/*boolean status=userNameExist(user.getUserName());
		if(status) {
			throw new UserExistException("There is an account with that userName :"  +user.getUserName());
		}
		
		boolean isEmail=userEmailExist(user.getEmail());
		if(isEmail) {
			throw new UserExistException("There is an account with that email :" + user.getEmail());
		}*/
		
		
		return userDao.createUser(user);
	}
	
	private boolean userNameExist(String userName) {
		return findUserByUserName(userName)!=null;
	}
	
	private boolean userEmailExist(String email) {
		return findUserByEmail(email)!=null;
	}

	@Override
	public void checkIfValidOldPassword(User user, String oldPassword) {//I am going to use spring security if I have more time
		
		
	}

	@Override
	public void changeUserPassword(User user, String password) {//I am going to use spring security
		user.setPassword(password);
		userDao.updatedUser(user);
		System.out.println("Your password is updated.");
	}

	@Override
	public void saveUser(User user) {
		userDao.createUser(user);
		
		System.out.println("The User is saved successfuly.");		
	}

	@Override
	public void updatedUser(User user) {
		userDao.updatedUser(user);
		System.out.println("The User is updated successfuly.");		
	}

	@Override
	public void deleteUser(User user) {		
		userDao.deleteUser(user);
		System.out.println("The User is deleted successfuly.");	
	}

	@Override
	public User findUserById(int id) {
		
		return userDao.findUserById(id);
	}

	@Override
	public User findUserByUserName(String userName) {
		
		return userDao.findUserByUserName(userName);
	}

	@Override
	public User findUserByEmail(String email) {
		
		return userDao.findUserByEmail(email);
	}

	@Override
	public List<User> findAllUsers() {
		
		return userDao.findAllUsers();
	}
	
	

}
