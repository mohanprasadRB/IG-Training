package com.mylms.batch;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mylms.entity.Book;
import com.mylms.repository.BookRepository;


@Component
public class BookDBWriter implements ItemWriter<Book>{
	
	@Autowired
	private BookRepository bookRepository;

	private static final Logger log = LoggerFactory.getLogger(BookDBWriter.class);
	@Override
	public void write(List<? extends Book> books) throws Exception {
		log.info("Data saved for :"+books);
		bookRepository.saveAll(books);
	}
}
