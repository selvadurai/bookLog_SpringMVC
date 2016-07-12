package com.book.controller;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.text.DateFormat;
import java.util.Date;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.book.beans.AccountDoa;
import com.book.beans.BigBookDoa;
import com.book.model.BigBookTable;

@Controller
public class BookController {

	 @Autowired
	 ApplicationContext context;
	 
	 @RequestMapping(value = "/add", method=RequestMethod.POST)
		public String addBooktoDatabase(@RequestParam("bookname")  String bookname,
				                        @RequestParam("isbn")      String ibsn,
				                        @RequestParam("afname")    String afname,
				                        @RequestParam("alname")    String alname,
				                        @RequestParam("desc")      String desc, 
				                        @RequestParam("lesson")    String lesson,
				                        @RequestParam("category")  String cat,
				                        @RequestParam("media")     String media,
				                        @RequestParam("rate")      String rate,
				                        Locale locale){
			
		 	BigBookDoa bookDoa = (BigBookDoa) context.getBean(BigBookDoa.class); 		 
		    BigBookTable book = new BigBookTable();
		    List<BigBookTable> bookList = bookDoa.getBookList();
		    int incrementId=bookList.size()+1;
		    
		    java.sql.Date today = new java.sql.Date(Calendar.getInstance().getTime().getTime());
			
			
		    
		    book.setId(incrementId);
		    book.setName(bookname);
		    book.setAuthorLname(alname);
		    book.setAuthorFname(afname);
		    book.setBookDesc(desc);
		    book.setBookRate(Integer.parseInt(rate));
		    book.setLessonLearn(lesson);
		    book.setCategory(cat);
		    book.setMediaType(media);
		    book.setIsbn(ibsn);
		    book.setDateRead(today); 
		    
		    bookDoa.addbook(book);
		    
		 	return "home";
			
		}
	
	 @RequestMapping(value = "/list", method=RequestMethod.GET)
		public String addList(Locale locale, Model model){
			BigBookDoa bookDoa = (BigBookDoa) context.getBean(BigBookDoa.class);
		    List<BigBookTable>bookList =bookDoa.getBookList();
		    model.addAttribute("bookList", bookList );
		 return "list";
	   }
 




}
