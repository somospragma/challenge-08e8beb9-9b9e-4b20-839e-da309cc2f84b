package com.pragma.payment.domain.model;

public record Transaction(Long id, Long accountId, Long clientId, Double amount, String status) {}