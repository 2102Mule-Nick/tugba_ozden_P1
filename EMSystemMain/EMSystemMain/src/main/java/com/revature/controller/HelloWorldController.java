package com.revature.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.pojo.Employee;

@Controller
public class HelloWorldController {

	@GetMapping("/hello")
	@ResponseBody
	public String helloWorld() {
		return "hello world!";
	}
	
	/*@GetMapping("/employee")
	@ResponseBody
	public Employee getItem() throws java.text.ParseException {
		DateFormat format = new SimpleDateFormat ("dd/MM/yyyy");
		Date date=null;
		try {
			date = format.parse("2/10/2021");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		//em.createEmployee(new Employee("John","Janet","email","215888683",date,1l,1l));
		return new Employee("Andro", "Sarman","ando@gmail.com", "216900000",date,2l,2l);
		
	}
	
	@PutMapping(path = "/employee")
	@ResponseBody
	public String updateItem(@RequestBody Employee employee) {
		
		System.out.println(employee);
		
		
		return "Item updated";
	}*/
	
		
}
