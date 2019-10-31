package com.kerno.sugar.service.Impl;

import com.kerno.sugar.mapper.UserMapper;
import com.kerno.sugar.pojo.user.User;
import com.kerno.sugar.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sugar
 * 2019/10/31
 * 17:20
 * 类作用描述
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int testUserAdd(User user) {
        return userMapper.add(user);
    }

    @Override
    public User findUser(Integer id) {
        return userMapper.find(id);
    }
}
