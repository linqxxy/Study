package com.linqxxy.mapper;

import com.linqxxy.po.UserEx;
import com.linqxxy.po.UserVO;

import java.util.List;

public interface UserExMapper {

    public List<UserEx> queryUserList(UserVO userVO) throws Exception;

    public void deleteUserByIds(Integer[] ids) throws Exception;

    void modifyUsers(List<UserEx> userExList) throws Exception;

    List<UserEx> queryUserByIds(Integer[] ids) throws Exception;
}
