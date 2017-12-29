package com.lb.architecture1.ordermgr.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lb.architecture1.common.service.BaseService;
import com.lb.architecture1.ordermgr.dao.OrderDao;
import com.lb.architecture1.ordermgr.vo.OrderModel;
import com.lb.architecture1.ordermgr.vo.OrderQueryModel;

@Service
@Transactional
public class OrderService extends BaseService<OrderModel,OrderQueryModel> implements IOrderService{
	private OrderDao dao = null;
	@Autowired
	private void setDao(OrderDao dao){
		this.dao = dao;
		super.setDao(dao);
	}
	
}