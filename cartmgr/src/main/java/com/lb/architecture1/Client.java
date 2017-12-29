package com.lb.architecture1;

import com.lb.architecture1.cartmgr.dao.CartDao;
import com.lb.pageUtil.Page;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CartDao dao = ac.getBean(CartDao.class);
        System.out.println("list == "+dao);
    }
}
