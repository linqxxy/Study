package com.linqxxy.git;

public class TestDemo {
    public static void main(String[] args) {
        ISubject iSubject= (ISubject) new ProxySubject().bind(new RealSubject());
        iSubject.eat("蛋炒饭",1);
    }
}
