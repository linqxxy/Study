package com.linqxxy.git.wwh1;

import java.util.*;

public class TestHashMap {
    public static void main1(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"java");
        map.put(3,"C++");
        map.put(2,"python");
        System.out.println(map);
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(0);
        list.sort(Integer::compare);
        System.out.println(list);
    }

    public static void main2(String[] args) {
        Stack<String> stack =new Stack<>();
        stack.push("java");
        stack.push("C++");
        stack.push("python");
        stack.push("PhP");
        stack.push("Rust");
        System.out.println("栈的大小"+stack.size());
        System.out.println("是否为空 "+stack.isEmpty());
        System.out.println("栈顶元素 "+stack.peek());
        System.out.println("出栈 "+stack.pop());
    }

    public static void main3(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("java");
        queue.add("C++");
        queue.add("PHP");
        queue.add("Python");
        System.out.println(queue.isEmpty());
    }
}
