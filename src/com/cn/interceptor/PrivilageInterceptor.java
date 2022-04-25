package com.cn.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

public class PrivilageInterceptor extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        HttpSession session= ServletActionContext.getRequest().getSession();
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser==null){
            return "login";
        }else {
            String invoke=actionInvocation.invoke();
            return invoke;
        }
    }
}
