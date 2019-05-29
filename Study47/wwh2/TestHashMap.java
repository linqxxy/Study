package com.linqxxy.git.wwh2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map =new HashMap<>();
        //1.key 可以为null
        //2. key 不能重复
        //3. value 可以为null
        //4 value 可以重复
        map.put(1,"java");
        map.put(2,"C");
        map.put(3,"python");
        map.put(4,"c++");
        map.put(5,null);
        map.put(6,"php");
        map.put(7,"javaScript");
        map.put(null,"SQL");
        System.out.println("结合列表"+map);
        System.out.println("集合大小"+map.size());
        System.out.println("集合所有key"+map.keySet());
        System.out.println("结合所有数据"+map.values());
        System.out.println("集合是否为空"+map.isEmpty());
        System.out.println("获取key为2的值"+map.get(2));
        System.out.println("是否包含key为8的值"+map.containsKey(8));
        for (String value:map.values()
             ) {
            System.out.println(value);
        }
        Set<Map.Entry<Integer, String>> set =map.entrySet();
        for (Map.Entry<Integer, String> entry:set
             ) {
            System.out.println(entry);
        }
    }
}
