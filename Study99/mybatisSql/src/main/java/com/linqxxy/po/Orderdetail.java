package com.linqxxy.po;

import lombok.Data;

@Data
public class Orderdetail
{
    private Integer id;

    private Integer itemsId;

    private Integer itemsNum;

    private Integer ordersId;
    private Items items;

    public Orderdetail()
    {

    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getOrdersId()
    {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId)
    {
        this.ordersId = ordersId;
    }

    public Integer getItemsId()
    {
        return itemsId;
    }

    public void setItemsId(Integer itemsId)
    {
        this.itemsId = itemsId;
    }

    public Integer getItemsNum()
    {
        return itemsNum;
    }

    public void setItemsNum(Integer itemsNum)
    {
        this.itemsNum = itemsNum;
    }

    @Override
    public String toString()
    {
        return "Orderdetail{" +
                "id=" + id +
                ", ordersId=" + ordersId +
                ", itemsId=" + itemsId +
                ", itemsNum=" + itemsNum +
                '}';
    }
}
