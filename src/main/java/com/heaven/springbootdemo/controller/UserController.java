package com.heaven.springbootdemo.controller;

import com.heaven.springbootdemo.dao.UserMapper;
import com.heaven.springbootdemo.entity.User;
import com.heaven.springbootdemo.scala.MyScala;
import com.heaven.springbootdemo.scala.Student;
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

    /*@Resource
    private UserService userService;*/

    @Resource
    private Student student;

    @Value("${heaven.key1}")
    private String key1;

    @Value("${heaven.key2}")
    private String key2;

    @RequestMapping("get")
    public User getUser() {
        User user = userMapper.selectByPrimaryKey(1L);
        MyScala.sayName(user.getUserName());
        Student s = new Student();
        System.out.println(s.sayName(user.getUserName()));;
        return user;
    }

    /*@RequestMapping("list")
    public List<User> getList() {
        List<User> users = userService.getAllUser();
        return users;
    }*/

    @RequestMapping("v")
    public String getValue() {
        return key1 + "->" + key2;
    }

    @RequestMapping("sc/list")
    public List<User> getListForScala() {
        List<User> users = student.getAllUser();
        return users;
    }

    @RequestMapping("sc/u")
    public User getUserForScala() {
        return student.getUserById(1L);
    }
}
