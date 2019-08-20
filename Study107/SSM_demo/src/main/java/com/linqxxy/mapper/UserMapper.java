package com.linqxxy.mapper;

import com.linqxxy.po.User;

public interface UserMapper {

    public void deleteUserById(Integer id) throws Exception;

    public void modifyUser(User user) throws Exception;

    User queryUserById(Integer id) throws Exception;

    void insertUser(User user) throws Exception;
}
