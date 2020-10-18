package com.ydx.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public void insertUser(){
        userDao.insert();
        System.out.println("完成插入");
    }
}

