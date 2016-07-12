package com.book.beans;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.book.model.Account;
import com.book.authentication.*;



public class AccountDoaImpl  implements AccountDoa{

	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
	
	
	@Override
	public boolean createUser(String username, String password, String role) {
		Account account= new Account();
	    List<Account> accountList=this.list(); 
		int seqGenIdNum=accountList.size()+1;
	    
		account.setId(seqGenIdNum);
		account.setUsername(username);
		account.setRole(role);
		try {
			account.setPassword(Encrypt.generateStorngPasswordHash(password));
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(account);
			tx.commit();
			session.close();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		  catch(Exception ex){
			  return false;
		  }
		
		
		return true;
	}

	@Override
	public boolean userLogin(String username, String password) {
		List<Account> accountlist=this.list(); 
		
		//(0)1 Notation 
		for (Account userList: accountlist) {
		     	 try {
		     		 if(userList.getUsername().equals(username)  
		     				 && Encrypt.validatePassword(password, userList.getPassword())==true ){
					
		    	  			return true;
		     		 }
		    	  	
		     	 } catch (NoSuchAlgorithmException e) {
		     		 // TODO Auto-generated catch block
		     		 e.printStackTrace();
		     	 } catch (InvalidKeySpecException e) {
		     		 // TODO Auto-generated catch block
		     		 e.printStackTrace();
			}	
		
	   }
		
		
		return false;
	}


	 public List<Account> list() {
		  Session session = this.sessionFactory.openSession();
		  List<Account> accountList = session.createQuery("from Account").list();
		  session.close();
		  return accountList;
	}



}
