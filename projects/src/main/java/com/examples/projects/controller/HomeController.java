package com.examples.projects.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.projects.model.Buyer;
import com.examples.projects.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;

	
	// Initial request will be mapped to this method and redirects to home page
	@RequestMapping(value="/")
	public ModelAndView showHomePage(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	// This method will validate the user type and redirects to corresponding page....
	@RequestMapping(value="/validateUser")
	public ModelAndView validateUser(@RequestParam String username, @RequestParam String password) throws IOException{
		String userType=null;
		if("admin".equals(username) && "admin".equals(password) ){
			userType="admin";
	 }
		else
		{
		List<Buyer> buyers = userService.getAllBuyers();
		for(Buyer b:buyers) {
			if(b.getUsername().equals(username) && b.getPassword().equals(password) ){
				userType="user";
				break;
			}
		}
		}
		if(userType!=null)
			return new ModelAndView(userType);
		else
			return new ModelAndView("home");
	}
	
	// It will redirect to jsp page to accept user registration data
	@RequestMapping(value="/addNewUser")
	public ModelAndView addNewUser() throws IOException{
		return new ModelAndView("register");
	}
	
	// registers a new user 
	@RequestMapping(value="/insertUser")
	public ModelAndView insertUserr(@RequestParam String username, @RequestParam String password, @RequestParam String email) throws IOException{
		Buyer buyer = new Buyer();
		buyer.setUsername(username);
		buyer.setPassword(password);
		buyer.setEmail(email);
		userService.inserUser(buyer);
		return new ModelAndView("home");
	}
	
	
	@RequestMapping(value="/newOrder")
	public ModelAndView newOrder() throws IOException{
		return new ModelAndView("newgiftorder");
	}
	
	
	
	
	@RequestMapping(value="/logout")
	public ModelAndView logout(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	
	@RequestMapping(value="/orderHistory")
	public ModelAndView orderHistory() throws IOException{
		return new ModelAndView("viewOrdersHistory");
	}
	
	@RequestMapping(value="/adminorderhistory")
	public ModelAndView adminorderhistory() throws IOException{
		return new ModelAndView("viewadminorderhistory");
	}
	
	
	@RequestMapping(value="/adminmonthlyreport")
	public ModelAndView adminmonthlyreport() throws IOException{
		return new ModelAndView("viewadminmonthlyreport");
	}
}
