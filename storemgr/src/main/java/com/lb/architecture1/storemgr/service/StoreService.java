package com.lb.architecture1.storemgr.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lb.architecture1.common.service.BaseService;
import com.lb.architecture1.storemgr.dao.StoreDao;
import com.lb.architecture1.storemgr.vo.StoreModel;
import com.lb.architecture1.storemgr.vo.StoreQueryModel;

@Service
@Transactional
public class StoreService extends BaseService<StoreModel,StoreQueryModel> implements IStoreService{
	private StoreDao dao = null;
	@Autowired
	private void setDao(StoreDao dao){
		this.dao = dao;
		super.setDao(dao);
	}
	
}