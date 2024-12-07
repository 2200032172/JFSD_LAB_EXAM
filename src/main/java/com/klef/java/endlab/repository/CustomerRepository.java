package com.klef.java.endlab.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.java.endlab.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
