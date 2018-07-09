package com.service;
import main.java.com.model.User;

public interface UserService {
    User selectByPrimaryKey(Long userId);
}
