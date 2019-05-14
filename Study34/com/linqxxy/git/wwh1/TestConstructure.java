package com.linqxxy.git.wwh1;

public class TestConstructure {

    public static void main(String[] args) {
        ObjectFactory<Integer,String,Person> factory=Person::new;
        Person p1=factory.createObject(10,"李雷");
        System.out.println(p1.toString());
    }
}
