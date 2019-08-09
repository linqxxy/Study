package com.linqxxy.mapper;

import com.linqxxy.po.Orders;
import com.linqxxy.po.User;

import java.util.List;

public interface OrderMapper{
    public List<Orders> queryUserToOrders();
}
