package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.entity.BookIssueTransaction;

public interface BookIssueTransactionRepository extends JpaRepository
<BookIssueTransaction, Long> {

}
