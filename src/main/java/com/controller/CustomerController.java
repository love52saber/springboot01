package com.controller;

import com.model.Customer;
import com.model.PageBean;
import com.service.CustomerService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/toAdd")
    public String toAdd() {
        return "jsp/customer/add";
    }

    @ApiOperation(value="新增客户", notes="")
    @PostMapping("/add")
    @ApiImplicitParam(name = "user",value = "顾客",dataType = "user")
    public String add(@RequestBody Customer customer) {
        customerService.save(customer);
        return "redirect:/customer/list";
    }
    @ApiOperation(value="分页查找客户", notes="")
    @GetMapping("/page")
    public String page(HttpServletRequest request,Customer customer) {
        PageBean<Customer> customerList = customerService.list(customer);
        request.setAttribute("customerList",customerList);
        return "jsp/customer/list";
    }
}
