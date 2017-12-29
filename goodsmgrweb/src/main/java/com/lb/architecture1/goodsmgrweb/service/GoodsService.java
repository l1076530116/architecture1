package com.lb.architecture1.goodsmgrweb.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lb.architecture1.common.service.BaseService;
import com.lb.architecture1.goodsmgrweb.dao.GoodsDao;
import com.lb.architecture1.goodsmgrweb.vo.GoodsModel;
import com.lb.architecture1.goodsmgrweb.vo.GoodsQueryModel;

@Service
@Transactional
public class GoodsService extends BaseService<GoodsModel,GoodsQueryModel> implements IGoodsService{
	private GoodsDao dao = null;
	@Autowired
	private void setDao(GoodsDao dao){
		this.dao = dao;
		super.setDao(dao);
	}
	
}