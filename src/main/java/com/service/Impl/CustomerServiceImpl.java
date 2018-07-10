package com.service.Impl;

import com.dao.CustomerMapper;
import com.model.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void save(Customer customer) {
        customerMapper.insertSelective(customer);
    }

    @Override
    public List<Customer> list(HashMap<String, Object> paramMap) {
        return customerMapper.selectByMap(paramMap);
    }
}
