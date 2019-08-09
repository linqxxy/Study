package com.linqxxy.dao;

import com.linqxxy.po.User;
import com.linqxxy.tools.DbManager;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> queryExecute() {
        List <User> list=new ArrayList<>();
        try{
            String strSql="select * from user";
            ResultSet rs=new DbManager().queryExcecute(strSql);
            while (rs.next()){
                User user=new User();
                user.setUserAddr(rs.getString("useraddr"));
                user.setUserName(rs.getString("username"));
                user.setUserId(rs.getInt("userid"));
                list.add(user);
            }
            return list;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }
}
