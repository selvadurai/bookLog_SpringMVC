package com.book.controller;


import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.book.beans.BigBookDoa;
import com.book.model.BigBookTable;

@Controller
public class BookController {

	 @Autowired
	 ApplicationContext context;
	 
	 /*purpose of the addBooktoDatabase is to take the parameters from      *
	  * addbook.jsp and insert them into Big_Book_Table. This Post function */
	 
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
				                        Locale locale,
				                        HttpServletRequest request){
			
		 
		    //Validates Session
			HttpSession session = request.getSession(false);
			if(session==null){
		        return "redirect:login";		
			}
			
		 
		    
		 	BigBookDoa bookDoa = (BigBookDoa) context.getBean(BigBookDoa.class); 		 
		    BigBookTable book = new BigBookTable();
		    
		    List<BigBookTable> bookList = bookDoa.getBookList();
		    
		    //Currently IncrementId the auto increment for the bigbooktable
		    int incrementId=bookList.size()+1; 
		    
		    //Today get today's date from the server
		    java.sql.Date today = new java.sql.Date(Calendar.getInstance().getTime().getTime());
			
		    try {
		    	 

		    //function being defined before being addded to hibernate 
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
		    
		    //Adds book to the bussiness model, and is now on the database. 
		    bookDoa.addbook(book);
		    
		    }
              catch (Exception e) {
		    	 return "redirect:add";
		       }

		 	return "home";
			
		}
	
	 /* ***************************************************
	  * Purpose of the addlist function 
	  * To send all BigBookTable classes to list.jsp view
	  *****************************************************/
	 @RequestMapping(value = "/list", method=RequestMethod.GET)
		public String addList(Locale locale, Model model,HttpServletRequest request){
		
		    //validates session 
		    HttpSession session = request.getSession(false);
			if(session==null){
		        return "redirect:login";		
			}
		 
		 
		    BigBookDoa bookDoa = (BigBookDoa) context.getBean(BigBookDoa.class);
		    
		    List<BigBookTable>bookList =bookDoa.getBookList();
		    
		    //send the list of books to list.jsp view
		    model.addAttribute("bookList", bookList );
		 return "list";
	   }
 
	 
	 /***************************************************
	  * Purpose of the bookDesc function is to redirect a book 
	  * on the list, to a book.jsp view, which then shows
	  * a detail descriptipn of the book.
	  *****************************************************/
	 
	 @RequestMapping(value = "/book", method=RequestMethod.GET)
       public  String bookDesc(Locale locale, Model model,@RequestParam String id,HttpServletRequest request){
		 
		 //Validates Session
		 HttpSession session = request.getSession(false);
			if(session==null){
		        return "login";		
		 }
		 
		 
		 BigBookDoa bookDoa = (BigBookDoa) context.getBean(BigBookDoa.class);
		 
		 BigBookTable book;
		 List<BigBookTable>bookList =bookDoa.getBookList();
		 
		 //searches through the book list in linear time O(1)
		 for(int i=0; i<=bookList.size();i++){
		      book = bookList.get(i); 
		      
		      //converts int url parameter into a string
		      String bookUser = Integer.toString(book.getId() );
		     
		      //sends the important description to the book.jsp view
		      if(bookUser.equals(id)){
		    	   model.addAttribute("id", book.getId() ); 
		    	   model.addAttribute("isbn", book.getIsbn() );
		    	   model.addAttribute("fname", book.getAuthorFname() );
		    	   model.addAttribute("lname", book.getAuthorLname() );
		    	   model.addAttribute("desc", book.getBookDesc());
		    	   model.addAttribute("rate", book.getBookRate());
		    	   model.addAttribute("lesson", book.getLessonLearn());
		    	   model.addAttribute("name", book.getName());
		    	   model.addAttribute("media", book.getMediaType());
		    	   model.addAttribute("cat", book.getCategory());   
		    	   return "book";
		      }
		   
		 }
		
		 
		 //if book not found error page
		 return "error";
	   
	   }
        
	 
	 
}
