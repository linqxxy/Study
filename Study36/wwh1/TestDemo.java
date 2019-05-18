package com.linqxxy.git.wwh1;

public class TestDemo {
    public static void main(String[] args) {
        ISubject subject = Factory.getInstance("com.linqxxy.git.wwh1.ProxySubject",
                Factory.getInstance("com.linqxxy.git.wwh1.RealSubject")) ;
        subject.eat() ;
    }
}
