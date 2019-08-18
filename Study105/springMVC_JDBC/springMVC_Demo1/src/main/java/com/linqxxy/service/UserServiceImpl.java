package com.linqxxy.service;

import com.linqxxy.dao.UserDao;
import com.linqxxy.po.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> queryService() throws Exception {
        return userDao.queryDao();
    }
}
