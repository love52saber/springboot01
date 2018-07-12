package com.service;

import com.model.Customer;
import com.model.PageBean;

public interface CustomerService {
    void save(Customer customer);

    PageBean<Customer> list(Customer customer);
}
