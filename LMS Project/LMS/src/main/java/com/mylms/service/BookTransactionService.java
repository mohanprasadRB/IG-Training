package com.mylms.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mylms.entity.Book;
import com.mylms.entity.BookTransaction;
import com.mylms.entity.User;
import com.mylms.repository.BookRepository;
import com.mylms.repository.BookTransactionRepository;
import com.mylms.repository.UserRepository;

@Service
public class BookTransactionService {
	
	@Autowired
	private BookTransactionRepository bookIssueRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookRepository bookRepository;

	
	public BookTransaction createBookIssue(long bookId, long userId, long libId,BookTransaction bookIssue) {
		User user = userRepository.findById(userId).get();
		User librarien = userRepository.findById(libId).get();
		Book book = bookRepository.findById(bookId).get();
		bookIssue.setBookId(book);
		bookIssue.setIssueTo(user);
		bookIssue.setCreatedBy(librarien);
		bookIssue.setIssuedBy(librarien);
		bookIssue.setBookIssueDate(new Date());
		bookIssue.setCreatedOn(new Date());
		return bookIssueRepository.save(bookIssue);
	}

 	public List<BookTransaction> findAllBookIssue() {
		return bookIssueRepository.findAll();
	}

 	public List<BookTransaction> getAllBookIssueByStatus(String status) {
		return bookIssueRepository.getBookIssueByStatus(status);
	}

	public Optional<BookTransaction> getBookIssueById(long transactionId) {
 		return bookIssueRepository.findById(transactionId);
	}


}
