package com.dzr.data.service.risk.impl;

import com.dzr.data.persistence.dzr.dao.UserDao;
import com.dzr.data.persistence.dzr.entity.User;
import com.dzr.data.service.risk.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value="userServiceImpl")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int count() {
        return 0;
    }

    @Override
    public User QueryByID(Long userId) {
        return userDao.getUserById(userId);
    }
}
