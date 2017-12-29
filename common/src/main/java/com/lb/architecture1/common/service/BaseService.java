package com.lb.architecture1.common.service;

import com.lb.architecture1.common.dao.BaseDao;
import com.lb.pageUtil.Page;
import com.lb.architecture1.common.vo.BaseModel;

import java.util.List;

public class BaseService<M,QM extends BaseModel> implements IBaseService<M,QM> {
    private BaseDao dao = null;

    public void setDao(BaseDao dao){
        this.dao = dao;
    }

    public void create(M cm) {
        dao.create(cm);
    }

    public void update(M cm) {
        dao.update(cm);
    }

    public void delete(Integer uuid) {
        dao.delete(uuid);
    }

    public M getByUuid(Integer uuid) {
        return (M) dao.getByUuid(uuid);
    }

    public Page<M> getByConditionPage(QM cqm) {
        List<M> list = dao.getByConditionPage(cqm);
        cqm.getPage().setResult(list);
        return cqm.getPage();
    }
}
