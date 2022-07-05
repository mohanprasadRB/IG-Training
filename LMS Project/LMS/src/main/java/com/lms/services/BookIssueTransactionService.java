package com.lms.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entity.BookIssueTransaction;
import com.lms.repository.BookIssueTransactionRepository;

@Service
public class BookIssueTransactionService {

	@Autowired
	BookIssueTransactionRepository repository;
	
	public BookIssueTransaction newTransaction(BookIssueTransaction transaction)
	{
		
		 
		return repository.save(transaction);
		
	}

	public Collection<BookIssueTransaction> getAllTransaction() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
