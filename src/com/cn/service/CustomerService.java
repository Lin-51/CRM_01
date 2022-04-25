package com.cn.service;

import com.cn.entity.Customer;

import java.util.List;

public interface CustomerService {
  public   List<Customer> findAll();

    void save(Customer customer);
}
