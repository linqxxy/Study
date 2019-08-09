package com.linqxxy.service;

import com.linqxxy.dao.UserDao;
import com.linqxxy.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public List<User> executeQuery() throws Exception {
        return userDao.executeQuery();
    }
}
