package com.pragma.payment.infrastructure.repository;

import com.pragma.payment.domain.model.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class TransactionRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private TransactionRepository transactionRepository;

    @Test
    void findByAccountId() {
        Transaction transaction = new Transaction(1L, 1L, 1L, 100.0, "PENDING");
        entityManager.persist(transaction);
        entityManager.flush();
        assertThat(transactionRepository.findById(1L)).isNotNull();
    }
}