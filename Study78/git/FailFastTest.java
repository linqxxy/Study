package com.inqxxy.git;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("linqxxy");
        list.add("Hello");
        list.add("World");
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            if(str.equals("linqxxy")){
                list.remove("linqxxy");
            }
            System.out.println(list);
        }
    }
}
