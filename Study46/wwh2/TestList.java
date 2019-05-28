package com.linqxxy.git.wwh2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("java");
        list.add(0,"C++");
        list.add("PHP");
        list.add("PHP");
        System.out.println("元素列表"+list);
        System.out.println("集合长度"+list.size());
        System.out.println("集合是否为空"+list.isEmpty());
        System.out.println("集合是否包含"+list.contains("PHP"));
        System.out.println("移除集合元素"+list.remove("PHP"));
        System.out.println("最终结果"+list);
//        Object[] objects=list.toArray();
//        for (Object obj:objects
//             ) {
//            System.out.println(obj);
//        }
    }
}
