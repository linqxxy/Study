package com.linqxxy.mapper;

import com.linqxxy.bz.UserBz;
import com.linqxxy.po.Orderdetail;
import com.linqxxy.po.Orders;
import com.linqxxy.po.User;
import com.linqxxy.po.UserEx;

import java.util.List;

public interface UserMapper {

    public List<UserEx> queryUserZH (UserBz userBz) throws Exception;
    public int queryUserCount (UserBz userBz) throws Exception;
    public List<UserEx> queryUserByMoreIds(UserBz userBz) throws Exception;
    public List<Orders> queryUserToOrders() throws Exception;

    public List<Orderdetail> queryUserToOrderdetail();

    public List<User> queryUserToItems() throws Exception;
}
