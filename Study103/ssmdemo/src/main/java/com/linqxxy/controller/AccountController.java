package com.linqxxy.controller;

import com.linqxxy.po.Account;
import com.linqxxy.service.AccountService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class AccountController {
    private final AccountService accountService;
    private final Account account;

    public AccountController(AccountService accountService, Account account) {
        this.accountService = accountService;
        this.account = account;
    }

    //商品列表查询
    @RequestMapping(value = "/login")
    public ModelAndView queryItemsList(String userName,String password) throws Exception{
        account.setUsername(userName);
        account.setPassword(DigestUtils.md5Hex(password));
        Account account1=accountService.Login(account);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsListKey",account1);
        modelAndView.setViewName("itemsList");
        System.out.println("success");
        return modelAndView;
    }
}
