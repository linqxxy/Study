package com.linqxxy.po;


import java.util.List;

/**
 * 包装类
 * VO,PO,DTO  Hibernate(ORMapping)  mybatis(ORmapper)伪
 * PO(游离态，持久态, 离线态)
 * User user = new User();--->游离态
 * session.save(user);
 * session.commit();------>持久态
 * session.delete(user);
 * session.commit();----->离线态
 * sqlSession.selectOne("namespace", object)
 *
 */
public class ItemsVO
{
    private Items items;

    private ItemsCustom itemsCustom;

    protected List<ItemsCustom> itemsCustomList;

    public List<ItemsCustom> getItemsList() {
        return itemsCustomList;
    }

    public void setItemsList(List<ItemsCustom> itemsList) {
        this.itemsCustomList = itemsList;
    }

    public Items getItems()
    {
        return items;
    }

    public void setItems(Items items)
    {
        this.items = items;
    }

    public ItemsCustom getItemsCustom()
    {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom)
    {
        this.itemsCustom = itemsCustom;
    }
}
