package com.mylms.test.repository;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mylms.entity.User;
import com.mylms.repository.UserRepository;


@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes = { UserRepositoryTest.class })
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	private User user;

	@BeforeEach
	public void setUpUser() {
		user = User.builder().build();
		
	}

	
	@Test
	public void test_saveUser() {
		User savedUser = userRepository.save(user);
		assertThat(savedUser).isNotNull();
		assertThat(savedUser.getUserId()).isGreaterThan(0);
	}
	
	
	@Test
	public void test_getAllUserList() {

		userRepository.save(user);
		List<User> userList = userRepository.findAll();
		assertThat(userList).isNotNull();
		assertThat(userList.size()).isEqualTo(5);
	}
	
	@Test
	public void test_findUserById()
	{
		userRepository.save(user);
		User savedUser=userRepository.findById(user.getUserId()).get();
		assertThat(savedUser).isNotNull();
	}
	
	@Test
	public void givenUserObject_whenUpdate_thenReturnUser() {
		userRepository.save(user);
		User savedUser = userRepository.findById(user.getUserId()).get();
		savedUser.setEmail("mohan@gmail.com");
		savedUser.setMobileNo(9110820860L);
		//User updateUser = userRepository.save(savedUser);
		assertThat(savedUser.getEmail()).isEqualTo("mohan@gmail.com");
		assertThat(savedUser.getMobileNo()).isEqualTo(9110820860L);
	}
	
	
}
