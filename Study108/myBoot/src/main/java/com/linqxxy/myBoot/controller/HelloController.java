package com.linqxxy.myBoot.controller;

import com.linqxxy.myBoot.po.Account;
import com.linqxxy.myBoot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/hello")
    //代表返回的不是一个逻辑视图名称，而是一个json串
    public String hello(){
        return "index";
    }
    @RequestMapping("/add")
    //代表返回的不是一个逻辑视图名称，而是一个json串
    public String add(){
        return "addAccount";
    }
    @RequestMapping("/query")
    //代表返回的不是一个逻辑视图名称，而是一个json串
    public String query(){
        return "queryAccount";
    }

    @RequestMapping("/queryAccounts")
    public String queryAccountById(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html;character=UTF-8");
        Integer id= Integer.valueOf(request.getParameter("id"));
        Account account=accountService.queryAccount(id);
        request.setAttribute("accountKey",account);

        return "showAccount";
    }
    @RequestMapping("/queryAllAccounts")
    public String queryAllAccounts(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html;character=UTF-8");
        List<Account> accountList=accountService.queryAllAccount();
        System.out.println(accountList);
        request.setAttribute("accountListKey",accountList);

        return "showAllAccounts";
    }
    @RequestMapping("/addAccounts")
    public String addAccount(HttpServletResponse response,HttpServletRequest request){
        response.setContentType("text/html;charcter=UTF-8");
        Account account=new Account();
        account.setUsername(request.getParameter("username"));
        account.setPassword(request.getParameter("password"));
        account.setName(request.getParameter("name"));
        if  (accountService.addAccount(account)){
            return "index";
        }else {
            return "addAccount";
        }
    }

    @RequestMapping("/delAccount")
    public String delAccount(HttpServletRequest request,HttpServletResponse response){
        response.setContentType("text/html;character=UTF-8");
        Integer id= Integer.valueOf(request.getParameter("id"));
        accountService.delAccount(id);
        return "index";
    }
    @RequestMapping("/updateAccount")
    public String updateAccount(HttpServletResponse response,HttpServletRequest request){
        response.setContentType("text/html;charcter=UTF-8");
        Integer id= Integer.valueOf(request.getParameter("id"));
        Account account=accountService.queryAccount(id);
        account.setUsername(request.getParameter("username"));
        account.setPassword(request.getParameter("password"));
        account.setName(request.getParameter("name"));
        accountService.updateAccount(id,account);
        return "index";
    }
}
