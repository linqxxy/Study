package com.linqxxy.controller;

import com.linqxxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "queryAllUser")
    public String test(){
        return "userList";
    }
}
