package com.linqxxy.git;

public class SingleTon2 {
    private static SingleTon2 instance;
    private SingleTon2(){
    }
    public static SingleTon2 getInstance() {
        if (instance == null) {
            instance = new SingleTon2();
        }
        return instance;
    }
    public void func(){
        System.out.println("懒汉单例模式");
    }
}
