package com.linqxxy.dao;

import com.linqxxy.po.User;
import com.linqxxy.tools.DbManager;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {
    public List<User> queryDao() {
        List<User> users=new ArrayList<>();
        try {
            String strSql="select * from user";
            ResultSet rs=new DbManager().queryExecute(strSql);
            while (rs.next()){
                User user=new User();
                user.setUserName(rs.getString("username"));
                user.setUserAddr(rs.getString("useraddr"));
                user.setUserId(rs.getInt("userid"));
                users.add(user);
            }
            return users;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return users;
    }
}
