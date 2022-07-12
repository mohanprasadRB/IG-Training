package com.mylms.test.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mylms.controller.BookController;
import com.mylms.entity.Book;
import com.mylms.repository.BookRepository;
import com.mylms.service.BookService;

@ComponentScan(basePackages  = "com.mylms.test.controller")
@AutoConfigureMockMvc
@ContextConfiguration
@SpringBootTest(classes=BookControllerTest.class)
public class BookControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@Mock
	BookService bookService;
	
	@Mock
	BookRepository bookRepository;
	
	@InjectMocks
	BookController bookController;
	
	List<Book> books;
	
	@BeforeEach
	public void setup()
	{
		mockMvc = MockMvcBuilders.standaloneSetup(bookController).build();
		
	}
	
	
	@Test
	public void test_getAllBooks() throws Exception
	{
		books=new ArrayList<Book>();
	    books.add(Book.builder().build());

		when(bookService.getAllBooks()).thenReturn(books);
		this.mockMvc.perform(get("/books"))
		.andExpect(status().isOk())
		.andDo(print());		 
	}
	
	
	@Test
	public void test_getBookById() throws Exception
	{
		 
		  Book book= Book.builder().bookId(10).build();

		long bookId=10;
		when(bookService.getBookByBookId(bookId)).thenReturn(book);
		//Optional<User> actual =  userService.getUserById(userId);
		 this.mockMvc.perform(get("/books/{bookId}",bookId))
		 .andExpect(status().isOk())
		 .andExpect(MockMvcResultMatchers.jsonPath(".bookId").value(10))
		// .andExpect(MockMvcResultMatchers.jsonPath(".userName").value("Ramesh"))
		 .andDo(print());

	}
	
	@Test
	public void test_saveBook() throws Exception
	{
		Book book = Book.builder().bookId(1000).author("RajkumarBuyya").bookName("Cloud").noOfCopies(111).publication("UVCE").status("Available").price(1000).build();
		Long id=10L;
		when(bookService.saveBook(id,book)).thenReturn(book);
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonbody = mapper.writeValueAsString(book);
		 
		this.mockMvc.perform(post("/books/{libId}",id )
							.content(jsonbody)
							.contentType(MediaType.APPLICATION_JSON))
							.andExpect(status().isOk())
							.andDo(print());

		
	}
	
	
	
	
	
}
