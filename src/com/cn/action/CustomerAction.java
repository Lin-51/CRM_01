package com.cn.action;

import com.cn.entity.Customer;
import com.cn.service.CustomerService;
import com.cn.service.Impl.CustomerServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import java.util.List;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    Customer customer=new Customer();
    CustomerService customerService=new CustomerServiceImpl();

    public String findAll(){
        List<Customer>list=customerService.findAll();
        //给页面存储一个list<Customer>集合
        ServletActionContext.getRequest().setAttribute("list",list);
        return "querySuccess";
    }
    @Override
    public Customer getModel() {
        return customer;
    }
    public String save(){
        customerService.save(customer);
        return "findAll";
    }
}
