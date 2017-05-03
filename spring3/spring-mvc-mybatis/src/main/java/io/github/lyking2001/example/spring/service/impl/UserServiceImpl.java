package io.github.lyking2001.example.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import io.github.lyking2001.example.spring.dao.UserMapper;
import io.github.lyking2001.example.spring.pojo.User;
import io.github.lyking2001.example.spring.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
