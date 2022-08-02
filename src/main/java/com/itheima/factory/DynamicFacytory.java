package com.itheima.factory;

import com.itheima.UserDao;
import com.itheima.impl.UserDaoImpl;

public class DynamicFacytory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
