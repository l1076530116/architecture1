package com.lb.architecture1.cartmgr.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lb.architecture1.common.service.BaseService;
import com.lb.architecture1.cartmgr.dao.CartDao;
import com.lb.architecture1.cartmgr.vo.CartModel;
import com.lb.architecture1.cartmgr.vo.CartQueryModel;

@Service
@Transactional
public class CartService extends BaseService<CartModel,CartQueryModel> implements ICartService{
	private CartDao dao = null;
	@Autowired
	private void setDao(CartDao dao){
		this.dao = dao;
		super.setDao(dao);
	}
	
}