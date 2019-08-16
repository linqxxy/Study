package com.linqxxy.mapper;

import com.linqxxy.po.Account;

import java.util.List;

public interface ItemsMapper {
    Account Login();

    boolean register();


    List<Account> browseAccount();

    Account getAccountByPassword();

    boolean updatePassword();
}
