package com.mylms.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mylms.entity.BookTransaction;

@Repository
public interface BookTransactionRepository extends JpaRepository<BookTransaction, Long>{

	List<BookTransaction> getBookIssueByStatus(String status);

//	@Query("select bi from BookIssue bi where bi.status=:s")
//	public List<BookTransaction> getBookIssueByStatus(@Param("s") String status);
}
