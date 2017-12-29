package com.lb.architecture1.customermgr.service;

import com.lb.architecture1.common.service.BaseService;
import com.lb.architecture1.customermgr.dao.CustomerDao;
import com.lb.architecture1.customermgr.vo.CustomerModel;
import com.lb.architecture1.customermgr.vo.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService extends BaseService<CustomerModel, CustomerQueryModel> implements ICustomerService{
    private CustomerDao dao = null;
    @Autowired
    private void setDao(CustomerDao dao){
        this.dao = dao;
        super.setDao(dao);
    }
}
