package com.linqxxy.git.wwh4;

public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Fruit fruit=FruitTree.getFruitInstance("com.linqxxy.git.wwh4.Orange");
        fruit.eat();
    }
}
