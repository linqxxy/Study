package com.linqxxy.model;

import com.linqxxy.dao.UserInfoDao;
import com.linqxxy.ov.Employee;

public class UserInfoService implements IUserInfoService {
    private UserInfoDao userInfoDao=new UserInfoDao();
    @Override
    public int checkUserInfoService(Employee employee) {
        return userInfoDao.checkUserInfo(employee);
    }
}
