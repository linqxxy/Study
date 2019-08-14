package com.linqxxy.service;

import com.linqxxy.po.Items;
import com.linqxxy.po.ItemsCustom;
import com.linqxxy.po.ItemsVO;

import java.util.List;

public interface ItemsService
{
    public List<ItemsCustom> queryItemsByNameService(ItemsVO itemsVO) throws Exception;

    //根据ID查询
    public Items queryItemsById(Integer id)throws Exception;
    //依据ID修改信息
    public void modifyItems(Integer id, Items items) throws Exception;

    //添加
    public void addItems(ItemsCustom itemsCustom) throws Exception;

    //删除
    public void moveItemsById(Integer id)throws Exception;

    //删除一组数据
    public void moveItemsByIds(Integer[] ids) throws Exception;
}
