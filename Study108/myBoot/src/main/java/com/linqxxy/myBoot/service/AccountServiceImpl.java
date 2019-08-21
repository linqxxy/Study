package com.linqxxy.myBoot.service;

import com.linqxxy.myBoot.dao.AccountDao;
import com.linqxxy.myBoot.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountDao accountDao;


    @Override
    public Account queryAccount(Integer id) {
        return accountDao.queryAccount(id);
    }

    @Override
    public boolean addAccount(Account account) {
        return accountDao.addAccount(account);
    }

    @Override
    public boolean delAccount(Integer id) {
        return accountDao.delAccount(id);
    }

    @Override
    public boolean updateAccount(Integer id,Account account) {
        return accountDao.updateAccount(id,account);
    }

    @Override
    public List<Account> queryAllAccount() {
        return accountDao.queryAllAccount();
    }
}
