package com.itheima.impl;

import com.itheima.UserDao;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl(){
        System.out.println("UserDaoImpl创建...");
    }

    @Override
    public void save() {
        System.out.println("sava runing....");
    }
}
