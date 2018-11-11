package com.heaven.springbootdemo.service.impl;

import com.heaven.springbootdemo.dao.UserMapper;
import com.heaven.springbootdemo.entity.User;
import com.heaven.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
