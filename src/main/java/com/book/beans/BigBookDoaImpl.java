package com.book.beans;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.book.model.BigBookTable;

public class BigBookDoaImpl implements BigBookDoa {

	//SessionFactory is created  
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
	
	@Override
	public void addbook(BigBookTable book) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(book);
		tx.commit();
		session.close();
	}

	
	
	@Override
	public List<BigBookTable> getBookList() {
		  Session session = this.sessionFactory.openSession();
		  List<BigBookTable> bookList = session.createQuery("from BigBookTable").list();
		  session.close();
		  return bookList;
	}

	
	
}
