package com.linqxxy.git.wwh1;

public class TestMethod {
    public static void main(String[] args) {
        IUtil2<String> iUtil2= () -> "hello".toUpperCase();
        IUtil2<String>iUtil21="Hello"::toUpperCase;
    }
}
