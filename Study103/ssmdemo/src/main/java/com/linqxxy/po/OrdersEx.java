package com.linqxxy.po;

import java.util.ArrayList;
import java.util.List;

public class OrdersEx extends Orders {

    public List<OrderItems> orderItemsList= new ArrayList<>();

    public List<OrderItems> getOrderItemsList() {
        return orderItemsList;
    }

    public void setOrderItemsList(List<OrderItems> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }
}
