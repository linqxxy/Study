package com.linqxxy.po;

import java.util.List;

/**
 * @ClassName UserVo
 * @Description TODO   包装类
 * @Author L
 * @Date 2019/8/16 15:22
 * @Version 1.0
 **/
public class UserVO {

    private User user;

    private UserEx userEx;

    private Integer[] ids;

    public Integer[] getIds() {
        return ids;
    }

    private List<UserEx> userExList;

    public List<UserEx> getUserExList() {
        return userExList;
    }

    public void setUserExList(List<UserEx> userExList) {
        this.userExList = userExList;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserEx getUserEx() {
        return userEx;
    }

    public void setUserEx(UserEx userEx) {
        this.userEx = userEx;
    }
}
