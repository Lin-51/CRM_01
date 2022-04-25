package com.cn.dao.Impl;

import com.cn.dao.UserDao;
import com.cn.entity.User;
import com.cn.util.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public User doLogin(User user) {

        Session session= HibernateUtils.openSession();
        Transaction tx = session.beginTransaction();

        Query query=session.createQuery("from User where user_code=? and user_password=?");
        query.setParameter(0,user.getUser_code());
        query.setParameter(1,user.getUser_password());
        List<User> list=query.list();
        tx.commit();
        session.close();

        if (list.size()==0){
            return null;
        }
        return list.get(0);
    }
}
