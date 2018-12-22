package com.heaven.springbootdemo.controller;

import com.heaven.springbootdemo.dao.UserMapper;
import com.heaven.springbootdemo.entity.User;
import com.heaven.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserService userService;

    @Value("${heaven.key1}")
    private String key1;

    @Value("${heaven.key2}")
    private String key2;

    @RequestMapping("get")
    public User getUser() {
        User user = userMapper.selectByPrimaryKey(1L);
        return user;
    }

    @RequestMapping("list")
    public List<User> getList() {
        List<User> users = userService.getAllUser();
        return users;
    }

    @RequestMapping("v")
    public String getValue() {
        return key1 + "->" + key2;
    }
}
