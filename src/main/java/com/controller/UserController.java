package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration()
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public @ResponseBody
    User getUser() {
       return userService.selectByPrimaryKey(5L);
    }
}
