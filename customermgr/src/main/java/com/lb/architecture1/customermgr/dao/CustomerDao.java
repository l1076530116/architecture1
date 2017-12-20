package com.lb.architecture1.customermgr.dao;

import com.lb.architecture1.common.dao.BaseDao;
import com.lb.architecture1.customermgr.vo.CustomerModel;
import com.lb.architecture1.customermgr.vo.CustomerQueryModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao extends BaseDao<CustomerModel,CustomerQueryModel>{
}
