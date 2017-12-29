package com.lb.architecture1.cartmgr.dao;

import org.springframework.stereotype.Repository;
import com.lb.architecture1.common.dao.BaseDao;

import com.lb.architecture1.cartmgr.vo.CartModel;
import com.lb.architecture1.cartmgr.vo.CartQueryModel;

@Repository
public interface CartDao extends BaseDao<CartModel,CartQueryModel>{
}
