package com.controller;

import com.model.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "jsp/customer/add";
    }

    @RequestMapping("/add")
    public String add(Customer customer) {
        customerService.save(customer);
        return "redirect:/customer/list";
    }
    @RequestMapping("/list")
    public String list(HttpServletRequest request) {
        String customer_name = request.getParameter("customer_name");
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("cust_name", customer_name);
        List<Customer> customerList = customerService.list(paramMap);
        request.setAttribute("customerList",customerList);
        return "jsp/customer/list";
    }
}
