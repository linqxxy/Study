package com.linqxxy.service;

import com.linqxxy.dao.UserDao;
import com.linqxxy.po.User;
import lombok.Data;

import java.util.List;

@Data
public class UserServiceImpl implements UserService {

    UserDao userDao;
    @Override
    public List<User> queryExecute() throws Exception {
        return userDao.queryExecute();
    }
}
