package com.linqxxy.git.wwh;


import java.util.LinkedList;
import java.util.List;

public class TestLikedList  {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("java");
        list.add(0,"PHP");
        list.add("C#");
        list.add("JavaScript");
        list.remove("JavaScript");
        System.out.println(list);
    }
}