package com.linqxxy.controller;

import com.linqxxy.vo.Items;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Handler2 implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request,
                              HttpServletResponse response) throws ServletException, IOException {

        List<Items> itemsList = new ArrayList<Items>();
        Items items1 = new Items();
        items1.setItemsId(1);
        items1.setItemsName("arvin");
        items1.setItemsPrice(200);

        Items items2 = new Items();
        items2.setItemsId(2);
        items2.setItemsName("arvin2");
        items2.setItemsPrice(200);

        Items items3 = new Items();
        items3.setItemsId(3);
        items3.setItemsName("arvin3");
        items3.setItemsPrice(200);

        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);

        //ModelAndView
        request.setAttribute("itemsListKey",itemsList);
        request.getRequestDispatcher("/jsps/showItemsList.jsp").forward(request,response);
    }
}
