package com.itheima.factory;

import com.itheima.UserDao;
import com.itheima.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
