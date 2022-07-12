package com.mylms.test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mylms.entity.User;
import com.mylms.repository.UserRepository;
import com.mylms.service.UserService;

@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest(classes = { UserServiceTest.class })
public class UserServiceTest {

	@Mock
	UserRepository userRepository;

	@InjectMocks
	UserService userService;

	private User user;

	@Test
	@Order(1)
	public void test_getAllUsers() {
		user = User.builder().userName("Ramesh").age(25).email("ramesh@gmail.com").gender("Male").mobileNo(9999999999L)
				.address("Mumbai").userType("STU").build();
		List<User> users = new ArrayList<User>();
		users.add(user);

		when(userRepository.findAll()).thenReturn(users);
		assertEquals(1, userService.getAllUsers().size());

	}

	@Test
	@Order(2)
	public void test_updateUser() {
		user = User.builder().userName("Ramesh").age(25).email("ramesh@gmail.com").gender("Male").mobileNo(999999999)
				.address("Mumbai").userType("STU").build();
		List<User> users = new ArrayList<User>();
		users.add(user);

		user.setAddress("Mysore");
		when(userRepository.save(user)).thenReturn(user);
		assertEquals(user, userService.updateUser(user));
		System.out.println(user.getAddress());

	}

	@Test
	@Order(3)
	public void test_createUser() {
		user = User.builder().userName("Ramesh").age(25).email("ramesh@gmail.com").gender("Male").mobileNo(999999999)
				.address("Mumbai").userType("STU").build();
		List<User> users = new ArrayList<User>();
		users.add(user);
		when(userRepository.save(user)).thenReturn(user);
		assertEquals(user, userService.createUser(user));

	}

	@Test
	@Order(3)
	public void test_creatingUser_WhenUserAlreadyExists() {
		// prepare test data
		String email = "me@gmail.com";
		User user = User.builder().email(email).build();

		// mock - calls
		when(userRepository.findByEmail(email)).thenReturn(Optional.of(user));

		// method call and assert error message
		try {
			userService.createUser(user);
		} catch (Exception e) {
			assertEquals("User already exist with given email :me@gmail.com", e.getMessage());
		}

	}

}
