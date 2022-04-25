package com.cn.service.Impl;

import com.cn.dao.CustomerDao;
import com.cn.dao.Impl.CustomerDaoImpl;
import com.cn.entity.Customer;
import com.cn.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private   CustomerDao customerDao;

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> list=customerDao.findAll();
        return list;
    }

    @Override
    public void save(Customer customer) {
        customerDao.save(customer);
    }
}
