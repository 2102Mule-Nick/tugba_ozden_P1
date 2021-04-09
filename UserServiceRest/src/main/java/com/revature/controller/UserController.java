package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.User;
import com.revature.service.UserService;
import com.revature.ws.Article;
import com.revature.ws.ArticleService;
import com.revature.ws.ArticleServiceImplService;

@Controller
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/example")
	@ResponseBody
	public String example() {
		return "working";
	}
	
	/*
	@PostMapping("/purchase")
	public PurchaseOrder createPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
		return purchaseOrderService.createPurchaseOrder(purchaseOrder.getDate(), purchaseOrder.getCartId());
	}
	
	@GetMapping("/purchase/user/{userId}")
	public List<PurchaseOrder> getPurchaseOrdersByUserId(@PathVariable int userId) {// could also use (@RequestParam int userId) {
																					// url would then look like localhost:8080/PurchaseService/purchase?userId=16
		return purchaseOrderService.getPurchaseOrderByUserId(userId);
		
	}*/
	
	@GetMapping("/user/{name}")
	@ResponseBody
	public User getUserByName(@PathVariable String name) {
		return userService.findUserByUserName(name);	
				
	}
	
	@GetMapping("/user")
	@ResponseBody
	public List<User> getAllUsers(){
		return userService.findAllUsers();
	}
	
	@GetMapping("/user-email/{email}")
	@ResponseBody
	public User getUserByEmail(@PathVariable String email){
		return userService.findUserByEmail(email);
	}
	
	@PostMapping("/user")
	@ResponseBody
	public String registerUser(@RequestBody User user) {
		
		userService.registerNewUser(user);
		
		return "The User is created." ;
		
	}
	/*SOAPCLIENT call the methods*/
	
	@GetMapping("/article")
	@ResponseBody
	public List<Article> getUsersArticles() {
		ArticleServiceImplService as=new ArticleServiceImplService();
		ArticleService ar=as.getArticleServiceImplPort();
		
		return ar.getAllArticles();
	}	
	
	@PostMapping("/article")
	@ResponseBody
	public void addArticle(@RequestBody Article article) {
		ArticleServiceImplService as=new ArticleServiceImplService();
		ArticleService ar=as.getArticleServiceImplPort();		
		ar.addArticle(article);
	
	}
	
	@GetMapping("/article/{title}")
	@ResponseBody
	public List<Article> getArticlesByTitle(@PathVariable String title) {
		ArticleServiceImplService as=new ArticleServiceImplService();
		ArticleService ar=as.getArticleServiceImplPort();		
		return ar.getArticlesByTitle(title);
	}
	
	/*Continue RESTService method mapping*/
	
	
	@PutMapping("/user")
	@ResponseBody
	public String updateUser(@RequestBody User user) {
		userService.updatedUser(user);
		
		return "The user is updated.";
	}
	
	
	
	
	
}
