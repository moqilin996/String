package com.itheima.test;

import com.itheima.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class SpringTest {
    @Test
    //测试scope属性
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1= (UserDao) app.getBean("userDao");
        System.out.println(userDao1);
    }
}
