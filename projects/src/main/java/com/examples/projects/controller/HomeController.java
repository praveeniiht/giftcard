package com.examples.projects.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.examples.projects.model.Buyer;
import com.examples.projects.model.GiftCardOrderDetails;
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
	public ModelAndView validateUser(HttpServletRequest request, @RequestParam String username, @RequestParam String password) throws IOException{
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
		if(userType!=null) {
			return new ModelAndView(userType);
		}
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
	public ModelAndView insertUser(@RequestParam String username, @RequestParam String password, @RequestParam String email) throws IOException{
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
	
	@RequestMapping(value="/placenewOrder")
	public ModelAndView placenewOrder(@RequestParam String receipentFirstName, @RequestParam String receipentLastName, @RequestParam String email,
	@RequestParam String address, @RequestParam String phoneNumber, @RequestParam long giftAmount)throws IOException{
	//public ModelAndView placenewOrder()
		
		GiftCardOrderDetails giftCardOrderDetails = new GiftCardOrderDetails();
		giftCardOrderDetails.setRecipientFirstName(receipentFirstName);
		giftCardOrderDetails.setRecipienLastName(receipentLastName);
		giftCardOrderDetails.setGiftAmount(giftAmount);
		giftCardOrderDetails.setPhoneNumber(phoneNumber);
		giftCardOrderDetails.setEmail(email);
		giftCardOrderDetails.setAddress(address);
		giftCardOrderDetails.setBuyerFirstName("Praveen");
		giftCardOrderDetails.setBuyerLastName("Kumar");
		userService.placeNewOrder(giftCardOrderDetails);	
		return new ModelAndView("orderconfirm");
	}
	
	@RequestMapping(value="/logout")
	public ModelAndView logout(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	
	@RequestMapping(value="/orderHistory")
	public ModelAndView orderHistory() throws IOException{
		List<GiftCardOrderDetails> allorders = userService.getAllOrdersByName("Praveen");
		for(GiftCardOrderDetails od : allorders) {
			System.out.println(od.getAddress());
		}
		return new ModelAndView("viewusernorderhistory", "orders",allorders);
	}
	
	@RequestMapping(value="/adminorderhistory")
	public ModelAndView adminorderhistory() throws IOException{
		List<GiftCardOrderDetails> allorders = userService.getAllOrders();
		System.out.println(allorders);
		for(GiftCardOrderDetails od : allorders) {
			System.out.println(od.getAddress());
		}
//		ModelAndView mnv = new ModelAndView();
//		mnv.addObject("orders", allorders);
//		mnv.setViewName("viewadminorderhistory");
//		return mnv;
		return new ModelAndView("viewadminorderhistory","orders",allorders);
	}
	
	
	
	@RequestMapping(value="/adminmonthlyreport")
	public ModelAndView adminmonthlyreport() throws IOException{
		return new ModelAndView("viewadminmonthlyreport");
	}
	@RequestMapping(value="/backtouser")
	public ModelAndView backtouser() throws IOException{
		return new ModelAndView("user");
	}
	@RequestMapping(value="/backtoadmin")
	public ModelAndView backtoadmin() throws IOException{
		return new ModelAndView("admin");
	}
}
