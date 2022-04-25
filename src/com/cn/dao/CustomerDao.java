package com.cn.dao;

import com.cn.entity.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> findAll();

    void save(Customer customer);
}
