package com.lb.architecture1.customermgr.vo;

import com.lb.pageUtil.Page;

public class CustomerQueryModel extends CustomerModel{
    private Page<CustomerModel> page = new Page<CustomerModel>();

    public Page<CustomerModel> getPage() {
        return page;
    }

    public void setPage(Page<CustomerModel> page) {
        this.page = page;
    }
}
