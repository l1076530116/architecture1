package com.lb.architecture1.customermgr;

import com.lb.architecture1.customermgr.dao.CustomerDao;
import com.lb.architecture1.customermgr.vo.CustomerModel;
import com.lb.architecture1.customermgr.vo.CustomerQueryModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao dao = ac.getBean(CustomerDao.class);
        CustomerModel cm = new CustomerModel();
        cm.setCustomerId("c1");
        cm.setShowName("c1");
        cm.setTrueName("李四");
        cm.setRegisterTime("1111");
        cm.setPwd("1111");
//        dao.create(cm);

        CustomerQueryModel cqm = new CustomerQueryModel();
        cqm.getPage().setPageShow(5);
        cqm.getPage().setNowPage(1);
        List<CustomerModel> list = dao.getByConditionPage(cqm);
        System.out.println(cqm.getPage());
        System.out.println("list == "+list);
    }
}
