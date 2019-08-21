package com.linqxxy.myBoot.dao;

import com.linqxxy.myBoot.po.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;

@Component
public class AccountDao {

    private static List<Account> accounts=new ArrayList<>();

    public boolean addAccount(Account account){
        accounts.add(account);
        account.setId(accounts.indexOf(account));
        return true;
    }

    public boolean delAccount(Integer id){
        if (accounts.isEmpty()&&id>=accounts.size()){
            return false;
        }else {
            return accounts.remove(id);
        }
    }
    public boolean updateAccount(Integer id,Account account){
        if (accounts.isEmpty()||!accounts.contains(account)){
            return false;
        }else {
            accounts.set(id,account);
            return true;
        }
    }
    public Account queryAccount(Integer id){
        if (accounts.isEmpty()){
            return null;
        }else {
            return accounts.get(id);
        }
    }

    public List<Account> queryAllAccount() {
        return accounts;
    }
}
