package com.mylms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mylms.entity.Book;
import com.mylms.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/books/{libId}")
	public Book saveBook(@PathVariable("libId") Long libId, @RequestBody Book book) {
		return bookService.saveBook(libId, book);
	}

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/books/{bookId}")
	public Book getBookByBookId(@PathVariable Long bookId) {
		return bookService.getBookByBookId(bookId);
	}

	@GetMapping("/books/search")
	public List<Book> getBookbyBookName(@RequestParam String bookName) {
		return bookService.getBookbyBookName(bookName);
	}
//	@GetMapping("/book/name/{bookName}")
//	public Book getBookbyBookName(@PathVariable String bookName){
//	return bookService.searchByBookName(bookName);
//}

//	@GetMapping("/books/auth")
//	public List<Book> getBookByAuthor(@RequestParam String authName){
//		return bookService.getBookByAuthor(authName);
//	}

	@GetMapping("/book/author/{authorname}")
	public Book getBookByAuthorName(@PathVariable String authorname) {
		return bookService.getBookByAuthorName(authorname);
	}

	@GetMapping("/book/publication/{publication}")
	public Book getBookByPublicationName(@PathVariable String publication) {
		return bookService.getBookByPublication(publication);
	}

	@GetMapping("/book/publisher/{publication}")
	public List<Book> findBookByPublicationName(@PathVariable String publication) {
		return bookService.findBookByAuthorName(publication);
	}

	@GetMapping("/inactivate-book/{bookid}")
	public void inactivateBook(@PathVariable long bookid) {
		bookService.inactivateBook(bookid);
	}
	
	@GetMapping("/activate-book/{bookid}")
	public void activateBook(@PathVariable long bookid) {
		bookService.activateBook(bookid);
	}
	@DeleteMapping("/deletebook/{bookid}")
	public void deleteBookById(@PathVariable long bookid)
	{
		bookService.deleteBookById(bookid);
	}
//	@GetMapping("/books/get")
//	public List<Book> getBookByAuthorAndBookName(@RequestParam String authName, @RequestParam String bookName){
//		return bookService.getBookByAuthorAndBookName(authName, bookName);
//	}
}
