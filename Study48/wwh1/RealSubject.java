package com.linqxxy.git.wwh1;

public class RealSubject implements  ISubject {
    @Override
    public void eat(String msg, int num) {
        System.out.println("我要吃"+num+"份"+msg);
    }
}
