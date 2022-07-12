package com.mylms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mylms.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);

}
