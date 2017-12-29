package com.lb.architecture1.common.vo;


import com.lb.pageUtil.Page;

import java.io.Serializable;

public class BaseModel implements Serializable{
    private Integer uuid;
    private Page page = new Page();

    public Integer getUuid() {
        return uuid;
    }
    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseModel baseModel = (BaseModel) o;

        return uuid != null ? uuid.equals(baseModel.uuid) : baseModel.uuid == null;
    }

    @Override
    public int hashCode() {
        return uuid != null ? uuid.hashCode() : 0;
    }
}
