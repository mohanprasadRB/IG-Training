package com.mylms.entity;

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
public class BookTransaction {

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
	private Date bookIssueDate;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date bookReturnDate;
	
	@ManyToOne
	@JoinColumn(name = "created_by", referencedColumnName = "userId")
	private User createdBy;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date createdOn;
	
	@ManyToOne
	@JoinColumn(name = "modified_by", referencedColumnName = "userId")
	private User modifiedBy;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date modifiedOn;
	
	private String status;
	
	private String remarks;

}
