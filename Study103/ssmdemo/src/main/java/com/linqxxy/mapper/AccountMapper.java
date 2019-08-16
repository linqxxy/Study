package com.linqxxy.mapper;

import com.linqxxy.po.Account;

import java.util.List;

public interface AccountMapper {
    Account Login(Account account);

    boolean register();

    List<Account> browseAccount();

    Account getAccountByPassword();

    boolean updatePassword();
}
