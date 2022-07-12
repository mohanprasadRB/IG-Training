package com.mylms.test.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.mylms.entity.Book;
import com.mylms.entity.BookTransaction;
import com.mylms.entity.User;
import com.mylms.repository.BookRepository;
import com.mylms.repository.BookTransactionRepository;
import com.mylms.repository.UserRepository;
import com.mylms.service.BookTransactionService;

@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest(classes = { BookTransactionServiceTest.class })
public class BookTransactionServiceTest {

	@Mock
	BookTransactionRepository bookTransactionRepository;

	@Mock
	private UserRepository userRepository;

	@Mock
	private BookRepository bookRepository;

	@InjectMocks
	BookTransactionService bookTransactionService;

	@Captor
	ArgumentCaptor<BookTransaction> bookTransactionCaptor;

	@Test
	public void test_createBookIssue() {
		// prepare test data
		long bookId = 1;
		long userId = 1;
		long libId = 2;
		BookTransaction bookIssue = BookTransaction.builder().build();
		User user = User.builder().build();
		User librarien = User.builder().build();
		Book book = Book.builder().build();

		// mock - db calls
		when(userRepository.findById(userId)).thenReturn(Optional.of(user));
		when(userRepository.findById(libId)).thenReturn(Optional.of(librarien));
		when(bookRepository.findById(bookId)).thenReturn(Optional.of(book));

		// method - call
		bookTransactionService.createBookIssue(bookId, userId, libId, bookIssue);

		// assert expected result
		Mockito.verify(bookTransactionRepository).save(bookTransactionCaptor.capture());
		BookTransaction actual = bookTransactionCaptor.getValue();
		assertNotNull(actual);
		assertEquals(bookIssue, actual);
		assertEquals(user, actual.getIssueTo());
		assertEquals(librarien, actual.getIssuedBy());
		assertEquals(librarien, actual.getCreatedBy());

	}

}
