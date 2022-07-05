package com.lms.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookid ;
	private String bookName;
	private String bookAuthor; 
	private String bookPublication; 
	private long bookPages; 
	private double bookPrice ;
	private long noOfCopies ;
	
	@ManyToOne
	@JoinColumn(name = "created_by",referencedColumnName = "userId")
	private User createdBy ;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date  createdOn;
	
	@ManyToOne
	@JoinColumn(name = "modified_by",referencedColumnName = "userId")
	private User modifiedBy; 
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedOn;
	
	public long getBookid() {
		return bookid;
	}
	public void setBookid(long bookid) {
		this.bookid = bookid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublication() {
		return bookPublication;
	}
	public void setBookPublication(String bookPublication) {
		this.bookPublication = bookPublication;
	}
	public long getBookPages() {
		return bookPages;
	}
	public void setBookPages(long bookPages) {
		this.bookPages = bookPages;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public long getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(long noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public User getCreated_by() {
		return createdBy;
	}
	public void setCreated_by(User created_by) {
		this.createdBy = created_by;
	}
	public Date getCreated_on() {
		return createdOn;
	}
	public void setCreated_on(Date created_on) {
		this.createdOn = created_on;
	}
	public User getModified_by() {
		return modifiedBy;
	}
	public void setModified_by(User modified_by) {
		this.modifiedBy = modified_by;
	}
	public Date getModified_on() {
		return modifiedOn;
	}
	public void setModified_on(Date modified_on) {
		this.modifiedOn = modified_on;
	}
	public Book(long bookid, String bookName, String bookAuthor, String bookPublication, long bookPages, double bookPrice,
			long noOfCopies, User created_by, Date created_on, User modified_by, Date modified_on) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublication = bookPublication;
		this.bookPages = bookPages;
		this.bookPrice = bookPrice;
		this.noOfCopies = noOfCopies;
		this.createdBy = created_by;
		this.createdOn = created_on;
		this.modifiedBy = modified_by;
		this.modifiedOn = modified_on;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPublication="
				+ bookPublication + ", bookPages=" + bookPages + ", bookPrice=" + bookPrice + ", noOfCopies="
				+ noOfCopies + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy
				+ ", modifiedOn=" + modifiedOn + "]";
	}
	
	
	
}
