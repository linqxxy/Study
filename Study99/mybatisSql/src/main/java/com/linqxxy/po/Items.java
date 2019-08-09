package com.linqxxy.po;

import lombok.Data;

import java.util.Date;

@Data
public class Items
{
    private Integer items_id;

    private String name;

    private Float price;

    private String pic;

    private Date createtime;

    private  String detail;

    public Items(){

    }
}
