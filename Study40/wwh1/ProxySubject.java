package com.lineqxxy.git.wwh1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxySubject implements InvocationHandler {
    private Object target;
    public Object bind(Object target){
    this.target=target;
    return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    public void  preHandel(){
        System.out.println("方法处理前");
    }
    public void afterHandel(){
        System.out.println("方法处理后");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.preHandel();
        Object ret= method.invoke(this.target,args);
        this.afterHandel();
        return ret;
    }
}
