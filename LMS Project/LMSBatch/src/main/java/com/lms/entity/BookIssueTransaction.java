package com.lms.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class BookIssueTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transactionId;
	
	@ManyToOne
	@JoinColumn(name = "book_id", referencedColumnName = "bookId")
	private Book bookId;
	
	@ManyToOne
	@JoinColumn(name = "issue_to",referencedColumnName = "userId")
	private User issueTo;
	
	@ManyToOne
	@JoinColumn(name = "issued_by",referencedColumnName = "userId")
	private User issuedBy;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	//@Temporal(TemporalType.TIMESTAMP)
	private Date bokkIssueDate;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	//@Temporal(TemporalType.TIMESTAMP)
	private Date bookReturnDate;
	
	@ManyToOne
	@JoinColumn(name = "created_by", referencedColumnName = "userId")
	private User createdBy;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	//@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;
	
	@ManyToOne
	@JoinColumn(name = "modified_by", referencedColumnName = "userId")
	private User modifiedBy;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	//@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedOn;
	
	private String status;
	
	private String remarks;

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public Book getBookId() {
		return bookId;
	}

	public void setBookId(Book bookId) {
		this.bookId = bookId;
	}

	public User getIssueTo() {
		return issueTo;
	}

	public void setIssueTo(User issueTo) {
		this.issueTo = issueTo;
	}

	public User getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(User issuedBy) {
		this.issuedBy = issuedBy;
	}

	public Date getBokkIssueDate() {
		return bokkIssueDate;
	}

	public void setBokkIssueDate(Date bokkIssueDate) {
		this.bokkIssueDate = bokkIssueDate;
	}

	public Date getBookReturnDate() {
		return bookReturnDate;
	}

	public void setBookReturnDate(Date bookReturnDate) {
		this.bookReturnDate = bookReturnDate;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public User getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(User modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BookIssueTransaction(long transactionId, Book bookId, User issueTo, User issuedBy, Date bokkIssueDate,
			Date bookReturnDate, User createdBy, Date createdOn, User modifiedBy, Date modifiedOn, String status,
			String remarks) {
		super();
		this.transactionId = transactionId;
		this.bookId = bookId;
		this.issueTo = issueTo;
		this.issuedBy = issuedBy;
		this.bokkIssueDate = bokkIssueDate;
		this.bookReturnDate = bookReturnDate;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.status = status;
		this.remarks = remarks;
	}

	public BookIssueTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}


}
