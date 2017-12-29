package com.lb.architecture1.ordermgr.dao;

import org.springframework.stereotype.Repository;
import com.lb.architecture1.common.dao.BaseDao;

import com.lb.architecture1.ordermgr.vo.OrderDetailModel;
import com.lb.architecture1.ordermgr.vo.OrderDetailQueryModel;

@Repository
public interface OrderDetailDao extends BaseDao<OrderDetailModel,OrderDetailQueryModel>{
	
}
