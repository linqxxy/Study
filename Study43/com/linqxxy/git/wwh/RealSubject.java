package com.linqxxy.git.wwh;

public class RealSubject implements ISubject {
    @Override
    public void eat(String msg, int num) {
        System.out.println("小儿给我来"+num+"份"+msg);
    }
}
