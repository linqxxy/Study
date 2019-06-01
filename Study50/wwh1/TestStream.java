package com.linqxxy.git.wwh1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"C++","PHP","SQL","python","C","C#",
                "Golang","Go","E","R","JavaScript","VB","Rust","Ruby","F#","Java","Cobal","CSS");
//        list.forEach(s-> System.out.println(s));
        System.out.println(list.size());
        System.out.println((long) list.size());
        System.out.println(list.stream().filter(s->s.contains("Java")).collect(Collectors.toList()));
        System.out.println(list.stream().map(String::toLowerCase).filter(s -> s.contains("c"))
        .filter(s -> s.length()>2).collect(Collectors.toList()));
        System.out.println(list.stream().filter(s -> s.contains("C"))
                .skip(2).limit(3).collect(Collectors.toList()));

    }
}
