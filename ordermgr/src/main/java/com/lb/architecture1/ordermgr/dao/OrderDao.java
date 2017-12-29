package com.lb.architecture1.ordermgr.dao;

import org.springframework.stereotype.Repository;
import com.lb.architecture1.common.dao.BaseDao;

import com.lb.architecture1.ordermgr.vo.OrderModel;
import com.lb.architecture1.ordermgr.vo.OrderQueryModel;

@Repository
public interface OrderDao extends BaseDao<OrderModel,OrderQueryModel>{
	
}
