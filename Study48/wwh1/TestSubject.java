package com.linqxxy.git.wwh1;

public class TestSubject {
    public static void main(String[] args) {
        ISubject iSubject= (ISubject) new ProxySubject().bind(new RealSubject());
        iSubject.eat("炒饭",1);
    }
}
