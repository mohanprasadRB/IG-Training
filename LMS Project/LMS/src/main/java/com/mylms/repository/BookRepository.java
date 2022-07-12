package com.mylms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mylms.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findByAuthor(String authName);

	List<Book> findAllByBookName(String bookName);

 
}
