package com.lms.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entity.Book;
import com.lms.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
 
	
	public Book  addBook(Book book)
	{
		return bookRepository.save(book);
	}
	
	public Collection<Book> getBook()
	{
		return bookRepository.findAll();
		
	}
}
