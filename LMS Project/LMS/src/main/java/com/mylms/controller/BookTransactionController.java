package com.mylms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mylms.entity.BookTransaction;
import com.mylms.service.BookTransactionService;

@RestController
public class BookTransactionController {

	@Autowired
	private BookTransactionService bookTransactionService;
	
	@PostMapping("/bookissue/{bookId}/{userId}/{libId}")
	public BookTransaction createBookIssue(@RequestBody BookTransaction bookIssue,
				@PathVariable("bookId")Long bookId,  
				@PathVariable("userId")Long userId, 
				@PathVariable("libId")Long libId) {
		return bookTransactionService.createBookIssue(bookId,userId, libId, bookIssue);
	}
	
	@GetMapping("/bookissue")
	public List<BookTransaction> findAllBookIssue(){
		return bookTransactionService.findAllBookIssue();
	}
	

	@GetMapping("/bookissue/{transactionId}")
	public Optional<BookTransaction> getBookIssueById(@PathVariable long transactionId){
		return bookTransactionService.getBookIssueById(transactionId);
	}
	@GetMapping("/bookissue/query")
	public List<BookTransaction> getAllBookIssueByStatus(@RequestParam String status){
		return bookTransactionService.getAllBookIssueByStatus(status);
	}
	
}
