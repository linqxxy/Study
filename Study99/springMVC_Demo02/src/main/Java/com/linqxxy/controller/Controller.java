package com.linqxxy.controller;

import com.linqxxy.po.User;
import com.linqxxy.service.UserService;
import lombok.Data;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Data
public class Controller implements org.springframework.web.servlet.mvc.Controller {

    private UserService userService;
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        try {
            List<User> list = userService.queryExecute();
            ModelAndView modelAndView=new ModelAndView();
            modelAndView.addObject("userListKey",list);
            modelAndView.setViewName("showUserList");
            return modelAndView;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
