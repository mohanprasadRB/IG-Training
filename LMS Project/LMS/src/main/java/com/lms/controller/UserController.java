package com.lms.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.entity.User;
import com.lms.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/getusers")
	public Collection<User> getUsers()
	{
		return userService.getUsers();
		
	}

}
