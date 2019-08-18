package com.linqxxy.controller;

import com.linqxxy.po.User;
import com.linqxxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ShowUserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/showUserList")
    public ModelAndView showUserList() throws Exception{

        List<User> userList =  userService.queryService();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userListKey",userList);
        modelAndView.setViewName("showuser");
        return modelAndView;
    }
}
