package com.lb.architecture1.common.dao;

import java.util.List;

public interface BaseDao<M,QM> {
    public void create(M cm);
    public void update(M cm);
    public void delete(Integer uuid);

    public M getByUuid(Integer uuid);
    public List<M> getByConditionPage(QM cqm);
}
