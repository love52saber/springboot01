package com.service.Impl;

import com.dao.CustomerMapper;
import com.github.pagehelper.PageHelper;
import com.model.Customer;
import com.model.PageBean;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public PageBean<Customer> list(Customer customer) {

        PageHelper.startPage(customer.getPageNum(), customer.getPageSize());

        List<Customer> customerList = customerMapper.selectByCustomer(customer);

        int totalCount = customerMapper.selectCount(customer);

        PageBean<Customer> customerPageBean = new PageBean<>(customer.getPageNum(), customer.getPageSize(), totalCount, customerList);

        return customerPageBean;
    }
}
