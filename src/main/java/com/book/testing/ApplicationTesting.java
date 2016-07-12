package com.book.testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.book.beans.AccountDoa;
import com.book.beans.BigBookDoa;
import com.book.model.BigBookTable;


public class ApplicationTesting {

	public static void main(String[] args) {
	     ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/root-context.xml");
	     AccountDoa accountDoa = context.getBean(AccountDoa.class);
	     BigBookDoa bookDoa    = context.getBean(BigBookDoa.class);
         System.out.println(accountDoa.userLogin("zeus1991","password"));
         BigBookTable book = new BigBookTable();
         book.setId(1);
         book.setName("Brick1991");
         bookDoa.addbook(book);
         
         System.out.println("Works");
	}

}
