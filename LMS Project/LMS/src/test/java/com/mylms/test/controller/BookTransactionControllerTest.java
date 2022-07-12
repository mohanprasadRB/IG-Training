package com.mylms.test.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mylms.controller.BookTransactionController;
import com.mylms.entity.Book;
import com.mylms.entity.BookTransaction;
import com.mylms.repository.BookTransactionRepository;
import com.mylms.service.BookTransactionService;

@AutoConfigureMockMvc
@ContextConfiguration
@ComponentScan(basePackages = "com.mylms.test.controller")
@SpringBootTest(classes = {BookTransactionControllerTest.class} )
public class BookTransactionControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@Mock
	BookTransactionService bookTransactionService;
	
	@Mock
	BookTransactionRepository bookTransactionRepository;
	
	@InjectMocks
	BookTransactionController bookTransactionController;
	
	List<BookTransaction> bookTransactions;
	
	@BeforeEach
	public void setup()
	{
		mockMvc = MockMvcBuilders.standaloneSetup(bookTransactionController).build();
		
	}
	
	@Test
	public void test_getAllTransactions() throws Exception
	{
		bookTransactions=new ArrayList<BookTransaction>();
		bookTransactions.add(BookTransaction.builder().build());

		when(bookTransactionService.findAllBookIssue()).thenReturn(bookTransactions);
		this.mockMvc.perform(get("/bookissue"))
		.andExpect(status().isOk())
		.andDo(print());		 
	}
	
	
	@Test
	public void test_getTransactionById() throws Exception
	{
		BookTransaction bookTransaction = BookTransaction.builder().transactionId(10).build();
		
		long tid=10;
		
		when(bookTransactionService.getBookIssueById(tid)).thenReturn(Optional.of(bookTransaction));
		 this.mockMvc.perform(get("/bookissue/{transactionId}",tid))
		 .andExpect(status().isOk())
		 .andExpect(MockMvcResultMatchers.jsonPath(".transactionId").value(10))
 		 .andDo(print());
		
	}
	
}
