package com.book.controller;


import java.util.List;
import java.util.Locale;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.book.beans.AccountDoa;
import com.book.beans.BigBookDoa;
import com.book.beans.ReportDoa;
import com.book.model.BigBookTable;

/**
 *Handles requests for the application home page.
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
	
	
	/*authenication purpose is to 
	* 1. Make sure the user logins in successfully 
	* 2. redirect unvalid logins
	* 3. Create a session when the user logins 
	*/
	@RequestMapping(value ="/login", method=RequestMethod.POST)
	public String authenication (@RequestParam("username") String username,@RequestParam("password") String password,
			HttpServletRequest request) {
		
		AccountDoa accountDoa = (AccountDoa) context.getBean(AccountDoa.class);
	    
		
	        if(accountDoa.userLogin(username,password)==true){
	    	   //Create a session object,if session object is not created. 
	           HttpSession session = request.getSession(true);
	           session = request.getSession(true);
	           session.setAttribute("username", username);
	           return "redirect:home";   
	       }
		
		
		return "redirect:login";

	}
	
	//purpose is to redirect to the login.jsp view
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String change(Locale locale, Model model,HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session!=null){
	       return "redirect:home";
		}
		else{
			return "login";
		}
		
	}
	
	
	//Purpose is to redirect to addbook.jsp view
	
	@RequestMapping(value = "/add", method=RequestMethod.GET)
    public String add(Locale locale, Model model,HttpServletRequest request){
	
		//check session if true
		HttpSession session = request.getSession(false);
		if(session==null){
	        return "redirect:login";		
		}
		else{
		   return "addbook";	
		}
		
	
	}

	//purpose is to redirect to home.jsp view
	
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public String home(Locale locale, Model model,HttpServletRequest request){
         
		 HttpSession session = request.getSession(false);
		 if(session==null){
	        return "redirect:login";		
		 }
		
		 /*creating report for home page. 
		  *Report contains the following information
		  *  1. number of books read
		  *  2. Progress bar showing visual representation of the 2016 reading cool of 2500 books.
		  *  3. Types of books read. 
		  */
		 
		 ReportDoa report = (ReportDoa) context.getBean("reportDAO");
		 BigBookDoa bookDoa = (BigBookDoa) context.getBean(BigBookDoa.class); 
		
		 List<BigBookTable> bookList = bookDoa.getBookList();
		 
		 //send to home.jsp, the number of books read
		 model.addAttribute("booksRead", bookList.size());
		
		 
		 //send to home.jsp total percentage of books read out 2500 books. 
		 model.addAttribute("totalPrecent", report.precentageRead(bookList.size()));
		 
		 
		 return "home";
	}

	
	/*Purpose of the out function is to kill the current session, 
	 * and log the user out successfully.  
	 * 
	 */
	@RequestMapping(value = "/out", method=RequestMethod.GET)
	public String out(Locale locale, Model model,HttpServletRequest request){
		HttpSession session = request.getSession(false);
		session.invalidate();//kills session
		return "redirect:login";
	}
}
