package com.linqxxy.po;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserEx
 * @Description TODO
 * @Author L
 * @Date 2019/8/16 15:16
 * @Version 1.0
 **/
public class UserEx  extends User{



    private List<UserEx> userExList = new ArrayList<>();


    public List<UserEx> getUserExList() {
        return userExList;
    }

    public void setUserExList(List<UserEx> userExList) {
        this.userExList = userExList;
    }

}
