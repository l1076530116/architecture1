package com.lb.architecture1.customermgr;

import com.lb.architecture1.customermgr.dao.CustomerDao;
import com.lb.architecture1.customermgr.service.CustomerService;
import com.lb.architecture1.customermgr.vo.CustomerModel;
import com.lb.architecture1.customermgr.vo.CustomerQueryModel;
import com.lb.pageUtil.Page;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = ac.getBean(CustomerService.class);
        /*CustomerModel cm = new CustomerModel();
        cm.setCustomerId("c1");
        cm.setShowName("c1");
        cm.setTrueName("李四");
        cm.setRegisterTime("1111");
        cm.setPwd("1111");*/
//        dao.create(cm);

        CustomerQueryModel cqm = new CustomerQueryModel();
        cqm.getPage().setPageShow(5);
        cqm.getPage().setNowPage(1);
        Page<CustomerModel> page = service.getByConditionPage(cqm);
        Page<CustomerModel> page2 = service.getByConditionPage(cqm);
        System.out.println("list == "+page);
        System.out.println("list == "+page2);
    }
}
