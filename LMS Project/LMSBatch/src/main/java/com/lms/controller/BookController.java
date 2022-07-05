package com.lms.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.entity.Book;
import com.lms.services.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/addbook")
	public Book book(@RequestBody Book book)
	{
		System.out.println(book);
		return bookService.addBook(book);
		
	}
	
	@GetMapping("/getbook")
	public Collection<Book> getBook()
	{
		return bookService.getBook();
		
	}
}
