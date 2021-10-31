package com.technavv.springbootecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technavv.springbootecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
