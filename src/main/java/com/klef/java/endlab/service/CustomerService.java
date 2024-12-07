package com.klef.java.endlab.service;


import org.springframework.stereotype.Service;

import com.klef.java.endlab.model.Customer;
import com.klef.java.endlab.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}

