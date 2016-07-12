package com.book.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * The persistent class for the BIG_BOOK_TABLE database table.
 * 
 */
@Entity
@Table(name="BIG_BOOK_TABLE")
public class BigBookTable{


	@Id
	private int id;

	@Column(name="AUTHOR_FNAME")
	private String authorFname;

	@Column(name="AUTHOR_LNAME")
	private String authorLname;

	@Column(name="BOOK_DESC")
	private String bookDesc;

	@Column(name="BOOK_RATE")
	private int bookRate;


	@Column(name="DATE_READ")
	private Date dateRead;

	private String isbn;

	private String keywords;

	@Column(name="LESSON_LEARN")
	private String lessonLearn;

	@Column(name="MEDIA_TYPE")
	private String mediaType;

	private String name;

	@Column(name="USER_ID")
	private int userId;
	
	
	@Column(name="CATEGORY")
	private String category;

	public BigBookTable() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthorFname() {
		return this.authorFname;
	}

	public void setAuthorFname(String authorFname) {
		this.authorFname = authorFname;
	}

	public String getAuthorLname() {
		return this.authorLname;
	}

	public void setAuthorLname(String authorLname) {
		this.authorLname = authorLname;
	}

	public String getBookDesc() {
		return this.bookDesc;
	}

	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}

	public int getBookRate() {
		return this.bookRate;
	}

	public void setBookRate(int bookRate) {
		this.bookRate = bookRate;
	}

	public Date getDateRead() {
		return this.dateRead;
	}

	public void setDateRead(Date dateRead) {
		this.dateRead = dateRead;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getLessonLearn() {
		return this.lessonLearn;
	}

	public void setLessonLearn(String lessonLearn) {
		this.lessonLearn = lessonLearn;
	}

	public String getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setCategory(String category){
		this.category=category;
	}  
	
	public String getCategory(){
		return category;  
	}
}
