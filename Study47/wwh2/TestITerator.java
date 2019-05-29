package com.linqxxy.git.wwh2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestITerator {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("C++");
        list.add("python");
        list.add("PHP");
        System.out.println(list);
        //不可以在foreach中修改
//        Iterator<String> iterator=list.iterator();
//        while (iterator.hasNext()){
//            String elem=iterator.next();
//            if("java".equals(elem)){
//            iterator.remove();
//            }
//        }
//        System.out.println(list);
        ListIterator<String> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next());
            System.out.print("  ->  ");
        }
        System.out.println();
        System.out.println("反向后");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous());
            System.out.print("  ->  ");
        }
    }
}
