package com.cn.service.Impl;

import com.cn.dao.Impl.UserDaoImpl;
import com.cn.dao.UserDao;
import com.cn.entity.User;
import com.cn.service.UserService;

public class UserServiceImpl implements UserService {
            private   UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User doLogin(User user) {
        User result=userDao.doLogin(user);
        return result;
    }
}
