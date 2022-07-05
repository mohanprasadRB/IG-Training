package com.lms.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.entity.BookIssueTransaction;
import com.lms.services.BookIssueTransactionService;

@RestController
public class BookIssueTransactionController {

	@Autowired
	BookIssueTransactionService service;
	
	
	@PostMapping("/newTransaction")
	public BookIssueTransaction newTransaction(BookIssueTransaction transaction)
	{
		return service.newTransaction(transaction);
		
	}
	
	@GetMapping("/gettransaction")
	public Collection<BookIssueTransaction> getAllTransaction()
	{
		return service.getAllTransaction();
		
	}
}
