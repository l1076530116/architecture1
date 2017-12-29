package com.lb.architecture1.goodsmgrweb.dao;

import org.springframework.stereotype.Repository;
import com.lb.architecture1.common.dao.BaseDao;

import com.lb.architecture1.goodsmgrweb.vo.GoodsModel;
import com.lb.architecture1.goodsmgrweb.vo.GoodsQueryModel;

@Repository
public interface GoodsDao extends BaseDao<GoodsModel,GoodsQueryModel>{
	
}
