package com.linqxxy.git;

public class SingleTon {
    private static SingleTon instance=new SingleTon();
    private SingleTon(){
    }
    public static SingleTon getInstance(){
        return instance;
    }
    public void func(){
        System.out.println("饿汉单例模式");
    }
}

