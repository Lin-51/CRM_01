package com.cn.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {
    public static SessionFactory sessionFactory=null;
    static {
        Configuration conf=new Configuration().configure();
        sessionFactory=conf.buildSessionFactory();
    }
    public static Session  openSession(){
        return sessionFactory.openSession();
    }

}
