package com.pragma.payment.domain.service;

import com.pragma.payment.domain.model.Transaction;

public interface TransactionService {
    Transaction createTransaction(Transaction transaction);
    Transaction updateTransaction(Transaction transaction);
    void deleteTransaction(Long id);
}