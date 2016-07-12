package com.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Account")
public class Account {

	@Id
	@Column(name="id")
	private int id;
	
	private String username;
	private String password;
    private String key;
    private String role;
    
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
 
   
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username=username;
	}

   public String getPassword(){
	   return password;
   }

   public void setPassword(String password){
	   this.password=password;
   }
   

   public String getRole(){
	   return role;
   }
   
   public void setRole(String role){
	   this.role=role;
   }

}
