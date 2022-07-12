package com.mylms.test.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mylms.controller.UserController;
import com.mylms.entity.User;
import com.mylms.repository.UserRepository;
import com.mylms.service.UserService;

@ComponentScan(basePackages = "com.mylms.test.controller")
@AutoConfigureMockMvc
@ContextConfiguration
@SpringBootTest(classes = {UserControllerTest.class} )
public class UserControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@Mock
	UserService userService;
	
	@Mock
	UserRepository userRepository;
	
	@InjectMocks
	UserController userController;
	
	List<User>  users;
	
	
	@BeforeEach
	public void setup()
	{
		mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	}
	
	@Test
	public void test_getAllUsers() throws Exception
	{
		users=new ArrayList<User>();
	    users.add(User.builder().userName("Ramesh").age(25).email("ramesh@gmail.com").gender("Male").mobileNo(9999999999L)
				.address("Mumbai").userType("STU").status("Active").build());

		//users.add(user);
		//users.add(u2);
		
		when(userService.getAllUsers()).thenReturn(users);
		this.mockMvc.perform(get("/users"))
		.andExpect(status().isOk())
		.andDo(print());		 
	}
	
	@Test
	public void test_getUserById() throws Exception
	{
		
		User user=User.builder().userId(10).userName("Ramesh").age(25).email("ramesh@gmail.com").gender("Male").mobileNo(9999999999L)
					.address("Mumbai").userType("STU").status("Active").build();

		long userId=10;
		when(userService.getUserById(userId)).thenReturn(Optional.of(user));
		//Optional<User> actual =  userService.getUserById(userId);
		 this.mockMvc.perform(get("/users/{userId}",userId))
		 .andExpect(status().isOk())
		 .andExpect(MockMvcResultMatchers.jsonPath(".userId").value(10))
		 .andExpect(MockMvcResultMatchers.jsonPath(".userName").value("Ramesh"))
		 .andDo(print());

	}
	
	@Test
	public void test_addUser() throws Exception
	{
		User user = User.builder().build();
		
		when(userService.createUser(user)).thenReturn(user);
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonbody = mapper.writeValueAsString(user);
		
		this.mockMvc.perform(post("/users")
							.content(jsonbody)
							.contentType(MediaType.APPLICATION_JSON))
							.andExpect(status().isOk())
							.andDo(print());
		
	}
}
