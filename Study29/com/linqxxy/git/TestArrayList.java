package com.linqxxy.git;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(1);
        list.addIndex(2,1);
        list.deleteAllKey(1);
        list.display();
        ArrayList<String> list1=new ArrayList<>();
        list1.addFirst("A");
        list1.addLast("B");
        list1.addIndex("C",1);
        list1.display();
    }
}
