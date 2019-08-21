package com.linqxxy.myBoot.service;

import com.linqxxy.myBoot.po.Account;

import java.util.List;

public interface AccountService {

    public Account queryAccount(Integer id);

    public boolean addAccount(Account account);

    public boolean delAccount(Integer id);

    public boolean updateAccount(Integer id,Account account);

    public List<Account> queryAllAccount();
}
