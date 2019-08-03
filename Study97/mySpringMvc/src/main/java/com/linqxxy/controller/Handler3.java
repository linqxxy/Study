package com.linqxxy.controller;


import com.linqxxy.vo.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Handler3 {

    @RequestMapping(value = "/showItemsList.action")
    public ModelAndView showItemsList(){
        List<Items> itemsList = new ArrayList<Items>();
        Items items1 = new Items();
        items1.setItemsId(1);
        items1.setItemsName("王文汉");
        items1.setItemsPrice(100);

        Items items2 = new Items();
        items2.setItemsId(2);
        items2.setItemsName("刘锋");
        items2.setItemsPrice(200);

        Items items3 = new Items();
        items3.setItemsId(3);
        items3.setItemsName("向阳");
        items3.setItemsPrice(300);

        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsListKey",itemsList);
        modelAndView.setViewName("showItemsList");
        return modelAndView;
    }
}
