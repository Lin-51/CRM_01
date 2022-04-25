package com.cn.dao;

import com.cn.entity.User;

public interface UserDao {
    User doLogin(User user);
}
