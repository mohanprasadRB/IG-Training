package com.mylms.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mylms.entity.User;
import com.mylms.repository.UserRepository;



@Service
public class UserService{

	@Autowired
	private UserRepository userRepository;
	
	
	public User createUser(User user) {
		Optional<User> savedUser = userRepository.findByEmail(user.getEmail());
		if(savedUser.isPresent()) {
			throw new IllegalStateException("User already exist with given email :"+user.getEmail());
		}
		return userRepository.save(user);
	}

	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	
	public Optional<User> getUserById(Long userId) {
		return userRepository.findById(userId);
	}

	
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	
	public void deleteUser(long userId) {
		boolean exists = userRepository.existsById(userId);
		if(exists==false)
			throw  new IllegalStateException("User id not found");
		userRepository.deleteById(userId);
	}

}
