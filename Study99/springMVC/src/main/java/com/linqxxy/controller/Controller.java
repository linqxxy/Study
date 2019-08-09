package com.linqxxy.controller;

import com.linqxxy.po.User;
import com.linqxxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/showUserList")
    public ModelAndView showUsetList() throws Exception {
        List<User> list=userService.executeQuery();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("userListKey",list);
        modelAndView.setViewName("showUserList");
        return modelAndView;
    }

}
