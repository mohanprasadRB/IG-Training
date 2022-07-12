package com.mylms.test.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mylms.entity.BookTransaction;
import com.mylms.repository.BookTransactionRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookTransactionRepositoryTest {

	
	@Autowired
	private BookTransactionRepository bookTransactionRepository;
	
	private BookTransaction bookTransaction;
	
	
	@BeforeEach
	public void setupBookTransaction()
	{
		bookTransaction=BookTransaction.builder()
					.bookIssueDate(new Date()).status("Approved").remarks("Book Issued").build();
	}
	
	@Test
	public void  test_saveBook()
	{
		BookTransaction savedBookTransaction= bookTransactionRepository.save(bookTransaction);
		assertThat(savedBookTransaction).isNotNull();
		assertThat(savedBookTransaction.getTransactionId()).isGreaterThan(0);
	}
	
	@Test
	public void test_getAllBookIssuedTransaction()
	{
		bookTransactionRepository.save(bookTransaction);
		BookTransaction bookTransaction2=BookTransaction.builder().build();
		bookTransactionRepository.save(bookTransaction2);
		List<BookTransaction> bookTransactionList = bookTransactionRepository.findAll();
		assertThat(bookTransactionList).isNotNull();
		assertThat(bookTransactionList.size()).isEqualTo(7);
	}
	
	
	@Test
	public void test_getBookIssuedTransactionById()
	{
		bookTransactionRepository.save(bookTransaction);
		BookTransaction savedBookTransaction = bookTransactionRepository.findById(bookTransaction.getTransactionId()).get();
		assertThat(savedBookTransaction).isNotNull();
	}
	
}
