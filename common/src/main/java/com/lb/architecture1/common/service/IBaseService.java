package com.lb.architecture1.common.service;

import com.lb.pageUtil.Page;
import com.lb.architecture1.common.vo.BaseModel;

public interface IBaseService<M, QM extends BaseModel> {
    public void create(M cm);
    public void update(M cm);
    public void delete(Integer uuid);

    public M getByUuid(Integer uuid);
    public Page<M> getByConditionPage(QM cqm);
}
