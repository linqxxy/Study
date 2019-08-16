package com.linqxxy.po;

import com.linqxxy.common.OrderStatus;

import java.time.LocalDateTime;

public class Orders {
    private String id;
    private Integer account_Id;
    private String account_name;
    private LocalDateTime create_time;
    private LocalDateTime finish_time;
    private Integer actual_ammount;
    private Integer total_money;
    private OrderStatus orderStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAccount_Id() {
        return account_Id;
    }

    public void setAccount_Id(Integer account_Id) {
        this.account_Id = account_Id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public LocalDateTime getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }

    public LocalDateTime getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(LocalDateTime finish_time) {
        this.finish_time = finish_time;
    }

    public Integer getActual_ammount() {
        return actual_ammount;
    }

    public void setActual_ammount(Integer actual_ammount) {
        this.actual_ammount = actual_ammount;
    }

    public Integer getTotal_money() {
        return total_money;
    }

    public void setTotal_money(Integer total_money) {
        this.total_money = total_money;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
