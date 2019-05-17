package com.linqxxy.git.wwh;

public class TestDemo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Fruit fruit=FruitTree.getInstance("Orange");
        fruit.print();
    }
}
