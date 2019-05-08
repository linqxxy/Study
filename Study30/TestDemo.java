package com.linqxxy.git;

public class TestDemo {
    public static void main(String[] args) {
        SingleTon singleTon=SingleTon.getInstance();
        singleTon.func();
        SingleTon2 singleTon2=SingleTon2.getInstance();
        singleTon2.func();
    }
}
