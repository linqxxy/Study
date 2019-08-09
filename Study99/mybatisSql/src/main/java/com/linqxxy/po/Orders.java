package com.linqxxy.po;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Orders {

    private Integer id;

    private Integer user_id;

    private String number;

    private Date createtime;

    private String note;
    private List<Orderdetail> orderdetailList;

    public Orders() {

    }
}
