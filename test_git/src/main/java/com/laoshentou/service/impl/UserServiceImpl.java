package com.laoshentou.service.impl;

import com.laoshentou.mapper.UserMapper;
import com.laoshentou.pojo.User;
import com.laoshentou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shenxiang
 * @date 2020年04月30日, 0030 13:28
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }
}
