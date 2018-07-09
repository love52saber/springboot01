package com.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl {

    @Autowired
    private main.java.com.dao.UserMapper UserMapper;

    public main.java.com.model.User selectByPrimaryKey(Long userId) {
        return UserMapper.selectByPrimaryKey(userId);
    }
}
