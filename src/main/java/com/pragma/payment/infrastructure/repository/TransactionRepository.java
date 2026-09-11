package com.pragma.payment.infrastructure.repository;

import com.pragma.payment.domain.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {}