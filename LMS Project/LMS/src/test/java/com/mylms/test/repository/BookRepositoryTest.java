package com.mylms.test.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.
api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mylms.entity.Book;
import com.mylms.repository.BookRepository;


//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class BookRepositoryTest {

	@Autowired
	private BookRepository bookRepository;
	
	private Book book;
	
	
	@BeforeEach
	public void setUpBook() {
		book = Book.builder().bookName("CloudCompute").author("Rajkumar Buyya").noOfCopies(100).pages(100).price(100.00)
				.publication("UVCE").status("Available").build();
	}
	
	@Test
	public void test_saveBook() {
		Book savedBook = bookRepository.save(book);
		assertThat(savedBook).isNotNull();
		assertThat(savedBook.getBookId()).isGreaterThan(0);
	}
	
	@Test
	public void test_BookList() {
		Book book1 = Book.builder().build();
		bookRepository.save(book);
		bookRepository.save(book1);
		List<Book> bookList= new ArrayList<Book>();
		bookList=bookRepository.findAll();
		assertThat(bookList).isNotNull();
		assertThat(bookList.size()).isGreaterThan(0);
	}
	
	@Test
	public void test_updateBook() {
		bookRepository.save(book);
		Book savedBook = bookRepository.findById(book.getBookId()).get();
		savedBook.setBookName("Advanced DevOops");
		savedBook.setNoOfCopies(80);
		Book updateBook = bookRepository.save(savedBook);
		assertThat(updateBook.getBookName()).isEqualTo("Advanced DevOops");
		assertThat(updateBook.getNoOfCopies()).isEqualTo(80);
	}
	
}
