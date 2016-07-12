package com.book.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.book.beans.AccountDoa;
import com.book.model.Account;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	   @Autowired
	   ApplicationContext context;

	
	/********************************
	 * user login   
	 ******/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "redirect:login";
	}
	
	@RequestMapping(value ="/login", method=RequestMethod.POST)
	public String createUser(@RequestParam("username") String username,@RequestParam("password") String password ) {
		
		AccountDoa accountDoa = (AccountDoa) context.getBean(AccountDoa.class);
	     
	     if(accountDoa.userLogin(username,password)==true){
	           return "home";   
	     }
	     else 
	     {
	           return "error";
	     }
	}
	
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String change(Locale locale, Model model) {
		return "login";
		
	}
	
	
	@RequestMapping(value = "/add", method=RequestMethod.GET)
    public String add(Locale locale, Model model){
		return "addbook";
	}

	
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public String main(Locale locale, Model model){
           return "home"; 
	}


}
