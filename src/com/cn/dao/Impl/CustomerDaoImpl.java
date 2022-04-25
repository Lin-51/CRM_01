package com.cn.dao.Impl;

import com.cn.dao.CustomerDao;
import com.cn.entity.Customer;
import com.cn.util.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public List<Customer> findAll() {
        Session session= HibernateUtils.openSession();
        Transaction tx = session.beginTransaction();

        Query query=session.createQuery("from Customer");
        List<Customer>list=query.list();

        tx.commit();
        session.close();


        return list;
    }

    @Override
    public void save(Customer customer) {
        Session session=HibernateUtils.openSession();
        Transaction tx = session.beginTransaction();

        session.save(customer);
        tx.commit();
        session.close();
    }
}
