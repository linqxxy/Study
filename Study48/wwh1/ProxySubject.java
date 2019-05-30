package com.linqxxy.git.wwh1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxySubject implements InvocationHandler {
    private Object target;
    public Object bind(Object target){
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    public void preHandle(){
        System.out.println("吃饭前准备");
    }
    public void afterHandle(){
        System.out.println("吃饭后");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.preHandle();
        Object ret=method.invoke(this.target,args);
        this.afterHandle();
        return ret;
    }
}
