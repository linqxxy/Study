package com.linqxxy.po;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class User
{
    private int id;
    private String username;
    private String sex;
    private Date birthday;
    private String address;
    private List<Orders> ordersList;
    private Items items;

    public User(){

    }

}
