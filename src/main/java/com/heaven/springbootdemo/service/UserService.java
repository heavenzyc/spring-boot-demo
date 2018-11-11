package com.heaven.springbootdemo.service;

import com.heaven.springbootdemo.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    User getUserById(Long id);

    int insertUser(User user);
}
