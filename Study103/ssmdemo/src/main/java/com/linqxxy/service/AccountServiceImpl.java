package com.linqxxy.service;

import com.linqxxy.mapper.AccountMapper;
import com.linqxxy.po.Account;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public  Account Login(Account account) {
        return accountMapper.Login(account);
    }

    @Override
    public boolean register(String userName, String password, String password2, String name, int accountType) {
          return accountMapper.register();
    }

    @Override
    public List<Account> browseAccount() {
        return accountMapper.browseAccount();
    }

    @Override
    public Account getAccountByPassword(String password) {
        return accountMapper.getAccountByPassword();
    }

    @Override
    public boolean updatePassword(String newPassword, Account account) {
        return accountMapper.updatePassword();
    }
}
