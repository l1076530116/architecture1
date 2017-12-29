package com.lb.architecture1.storemgr.dao;

import org.springframework.stereotype.Repository;
import com.lb.architecture1.common.dao.BaseDao;

import com.lb.architecture1.storemgr.vo.StoreModel;
import com.lb.architecture1.storemgr.vo.StoreQueryModel;

@Repository
public interface StoreDao extends BaseDao<StoreModel,StoreQueryModel>{
	
}
