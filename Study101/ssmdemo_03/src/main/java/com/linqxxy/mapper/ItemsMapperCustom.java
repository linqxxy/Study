package com.linqxxy.mapper;


import com.linqxxy.po.ItemsCustom;
import com.linqxxy.po.ItemsVO;

import java.util.List;

public interface ItemsMapperCustom
{
    public List<ItemsCustom> queryItemsByName(ItemsVO itemsVO) throws Exception;

    public void deleteItemsByIds(Integer[] ids) throws Exception;
}