package com.mylms.test.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.mylms.entity.Book;
import com.mylms.entity.User;
import com.mylms.repository.BookRepository;
import com.mylms.repository.UserRepository;
import com.mylms.service.BookService;

@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest(classes = { BookServiceTest.class })
public class BookServiceTest {

	@Mock
	BookRepository bookRepository;

	@Mock
	UserRepository userRepository;

	@InjectMocks
	BookService bookService;

	@Captor
	ArgumentCaptor<Book> bookCaptor;

	private Book book;

	@Test
	@Order(1)
	public void getAllBooks() {
		book = Book.builder().bookName("Mohan").author("Mohan").bookId(100).build();
		List<Book> books = new ArrayList<Book>();

		books.add(book);
		when(bookRepository.findAll()).thenReturn(books);
		assertEquals(1, bookService.getAllBooks().size());

	}

	@Order(2)
	@Test
	public void test_saveBook() {
		// Prepare test data
		long id = 10;
		User user = User.builder().userId(19).build();
		Book book = Book.builder().bookId(id).bookName("Mohan").author("Mohan").bookId(100).build();

		// mock - db calls
		when(userRepository.findById(id)).thenReturn(Optional.of(user));

		// method - call
		bookService.saveBook(id, book);

		// assert expected result
		Mockito.verify(bookRepository).save(bookCaptor.capture());
		Book actual = bookCaptor.getValue();
		assertNotNull(actual);
		assertEquals(book, actual);
		assertEquals(user, actual.getCreatedBy());
	}
	 
}
