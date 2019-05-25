package com.linqxxy.git.wwh1;

public class Factory {
    public static ISubj getInstance(){
        return new ProxySubj(new RealSubj());
    }
}
