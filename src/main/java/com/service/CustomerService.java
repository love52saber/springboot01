package com.service;

import com.model.Customer;

import java.util.HashMap;
import java.util.List;

public interface CustomerService {
    void save(Customer customer);

    List<Customer> list(HashMap<String, Object> paramMap);
}
