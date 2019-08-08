package com.linqxxy.service;

import com.linqxxy.po.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> queryService() throws Exception;
}
