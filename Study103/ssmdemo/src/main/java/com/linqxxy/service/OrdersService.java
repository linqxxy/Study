package com.linqxxy.service;

import com.linqxxy.po.Orders;

import java.util.List;

public interface OrdersService {

    public boolean commitOrder(Orders order);

    public List<Orders> queryOrderByAccount(Integer id);
}
