package com.mylms.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mylms.entity.Book;
import com.mylms.entity.User;
import com.mylms.repository.BookRepository;
import com.mylms.repository.UserRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private UserRepository userRepository;

	public Book saveBook(Long libId, Book book) {
		User user = userRepository.findById(libId).get();
		book.setCreatedBy(user);
		book.setCreatedOn(new Date());
		return bookRepository.save(book);
	}

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public Book getBookByBookId(Long bookId) {
		return bookRepository.findById(bookId).get();
	}

	public List<Book> getBookbyBookName(String bookName) {
		return bookRepository.findAllByBookName(bookName);
	}

	public Book searchByBookName(String bookName) {

		List<Book> books = bookRepository.findAll();
		Book book = null;
		for (Book u : books) {
			if (u.getBookName().equalsIgnoreCase(bookName))
				book = u;
		}
		return book;
	}

	public List<Book> getBookByAuthor(String authName) {
		return bookRepository.findByAuthor(authName);
	}

	public Book getBookByAuthorName(String authorname) {

		List<Book> books = bookRepository.findAll();
		Book author = null;
		for (Book u : books) {
			if (u.getAuthor().equalsIgnoreCase(authorname))
				author = u;
		}
		return author;
	}

	public List<Book> findBookByAuthorName(String authorname) {

		List<Book> books = bookRepository.findAll();
		List<Book> book2 = new ArrayList<>();
		Book author = null;
		for (Book u : books) {
			if (u.getAuthor().equalsIgnoreCase(authorname))
				book2.add(u);
		}
		return book2;

	}

	public Book getBookByPublication(String publishername) {

		List<Book> books = bookRepository.findAll();
		Book publisher = null;
		for (Book u : books) {
			if (u.getPublication().equalsIgnoreCase(publishername))
				publisher = u;
		}
		return publisher;
	}

		public void deleteBookById(long id) {
 			  bookRepository.deleteById(id);
		}

	public void inactivateBook(long id) {

		Book book = bookRepository.findById(id).get();
		if(Objects.isNull(book)) {
			throw new IllegalStateException("Book not exists for id : " + id);
		}
		book.setActive(false);
		bookRepository.save(book);
	}
	
	public void activateBook(long id) {

		Book book = bookRepository.findById(id).get();
		if(Objects.isNull(book)) {
			throw new IllegalStateException("Book not exists for id : " + id);
		}
		book.setActive(true);
		bookRepository.save(book);
	}

//		
//		public List<Book> getBookByAuthorAndBookName(String authName, String bookName) {
//			return bookRepository.findByAuthorAndBookName(authName, bookName);
//		}

}
