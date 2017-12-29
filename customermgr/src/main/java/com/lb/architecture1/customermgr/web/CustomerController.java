package com.lb.architecture1.customermgr.web;

import com.lb.architecture1.customermgr.service.ICustomerService;
import com.lb.architecture1.customermgr.vo.CustomerModel;
import com.lb.architecture1.customermgr.vo.CustomerQueryModel;
import com.lb.architecture1.util.format.DateFormatHelper;
import com.lb.architecture1.util.json.JsonHelper;
import com.lb.pageUtil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value = "toAdd", method = RequestMethod.GET)
    public String toAdd(){
        return "customer/add";
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String add(@ModelAttribute("cm")CustomerModel cm){
        cm.setRegisterTime(DateFormatHelper.long2Str(System.currentTimeMillis()));
        customerService.create(cm);
        return "customer/success";
    }

    @RequestMapping(value = "toUpdate/{customerUuid}", method = RequestMethod.GET)
    public String toAdd(@PathVariable("customerUuid") Integer customerUuid, Model model){
        CustomerModel cm = customerService.getByUuid(customerUuid);
        model.addAttribute("cm",cm);
        return "customer/update";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(@ModelAttribute("cm")CustomerModel cm){
        customerService.update(cm);
        return "customer/success";
    }

    @RequestMapping(value = "toDelete/{customerUuid}", method = RequestMethod.GET)
    public String toDelete(@PathVariable("customerUuid") Integer customerUuid, Model model){
        CustomerModel cm = customerService.getByUuid(customerUuid);
        model.addAttribute("cm",cm);
        return "customer/delete";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String delete(@RequestParam("uuid") Integer customerUuid){
        customerService.delete(customerUuid);
        return "customer/update";
    }
    @RequestMapping(value = "toList", method = RequestMethod.GET)
    public String toList(@ModelAttribute("wm") CustomerWebModel wm, Model model){
        CustomerQueryModel cqm = null;
        if(null == wm.getQueryJsonStr() || wm.getQueryJsonStr().trim().length() == 0){
            cqm = new CustomerQueryModel();
        }else {
            cqm = (CustomerQueryModel)JsonHelper.str2Object(wm.getQueryJsonStr(),CustomerQueryModel.class);
        }
        cqm.getPage().setNowPage(wm.getNowPage());
        if(wm.getPageShow() > 0){
            cqm.getPage().setPageShow(wm.getPageShow());
        }
        Page dbPage = customerService.getByConditionPage(cqm);

        model.addAttribute("wm",wm);
        model.addAttribute("page",dbPage);
        return "customer/list";
    }

    @RequestMapping(value = "toQuery", method = RequestMethod.GET)
    public String toQuery(){
        return "customer/query";
    }

}
