package com.lb.architecture1.ordermgr.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lb.architecture1.common.service.BaseService;
import com.lb.architecture1.ordermgr.dao.OrderDetailDao;
import com.lb.architecture1.ordermgr.vo.OrderDetailModel;
import com.lb.architecture1.ordermgr.vo.OrderDetailQueryModel;

@Service
@Transactional
public class OrderDetailService extends BaseService<OrderDetailModel,OrderDetailQueryModel> implements IOrderDetailService{
	private OrderDetailDao dao = null;
	@Autowired
	private void setDao(OrderDetailDao dao){
		this.dao = dao;
		super.setDao(dao);
	}
	
}