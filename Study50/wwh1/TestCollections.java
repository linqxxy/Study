package com.linqxxy.git.wwh1;

import java.util.*;

public class TestCollections {
    public static void main1(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"java","C++","python");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void main2(String[] args) {
       List<Integer> integers=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<10;i++){
            integers.add(random.nextInt(100));
        }
        System.out.println(integers);
        Integer maxValue=Collections.max(integers);
        System.out.println(maxValue);
    }

    public static void main3(String[] args) {
        List<Integer> integers=new ArrayList<>();
        for(int i=0;i<=54;i++){
            integers.add(i);
        }
        System.out.println(integers);
        Collections.shuffle(integers);
        System.out.println(integers);
    }

    public static void main(String[] args) {
        Map<Integer,String> map=Collections.singletonMap(1,"66");
    }
}
