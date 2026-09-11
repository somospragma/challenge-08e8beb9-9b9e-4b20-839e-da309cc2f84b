package com.pragma.payment.domain.service;

import com.pragma.payment.domain.model.Transaction;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;

@SpringBootTest
class TransactionServiceTest {
    @Mock
    private TransactionRepository transactionRepository;
    @InjectMocks
    private TransactionService transactionService;

    @Test
    void createTransaction() {
        MockitoAnnotations.openMocks(this);
        Transaction transaction = new Transaction(1L, 1L, 1L, 100.0, "PENDING");
        when(transactionRepository.save(transaction)).thenReturn(transaction);
        Transaction result = transactionService.createTransaction(transaction);
        assert result!= null;
    }
}