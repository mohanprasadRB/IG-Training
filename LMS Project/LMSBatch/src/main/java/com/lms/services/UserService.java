package com.lms.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entity.User;
import com.lms.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User addUser(User user)
	{
		return userRepository.save(user);
		
	}

	public Collection<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	
}
