package com.lineqxxy.git.wwh5;

public class TestDemo {
    public static void main(String[] args) {
        ISubject subject =Factory.getInstance("com.lineqxxy.git.wwh5.ProxySubject",Factory.getInstance("com.lineqxxy.git.wwh5.RealSubject")) ;
        subject.eat() ;
    }
}
