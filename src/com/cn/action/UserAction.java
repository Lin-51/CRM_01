package com.cn.action;

import com.cn.entity.User;
import com.cn.service.Impl.UserServiceImpl;
import com.cn.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user=new User();

    public String doLogin(){
        System.out.println(user);
        User user=userService.doLogin(this.user);
        if (user==null){
            return LOGIN;
        }else {
            ServletActionContext.getRequest().getSession().setAttribute("loginUser",user);
            return "loginSuccess";
        }
    }
    @Override
    public User getModel() {
        return user;
    }
}
