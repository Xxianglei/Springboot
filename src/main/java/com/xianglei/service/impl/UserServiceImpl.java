package com.xianglei.service.impl;

import com.xianglei.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xianglei.pojo.User;
import com.xianglei.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> find() {
        return userMapper.findAll();
    }
}
