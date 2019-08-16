package com.linqxxy.service;

import com.linqxxy.po.Account;

import java.util.List;

public interface AccountService {
    public  Account Login(Account account);
    public boolean register(String userName, String password, String password2, String name, int accountType);

    public List<Account> browseAccount();

    public Account getAccountByPassword(String password);

    public boolean updatePassword(String newPassword, Account account);
}
