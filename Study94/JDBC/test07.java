package com.linqxxy.test;

import java.util.*;
public class test07 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            Map<String,Integer> map=new LinkedHashMap<>();
            for(int i=0;i<n;i++){
                map.put(sc.next(),0);
            }
            int Invalid=0;
            int m=sc.nextInt();
            for(int i=0;i<m;i++){
                String c=sc.next();
                if(map.get(c)==null){
                    Invalid++;
                }else{
                    map.put(c,map.get(c)+1);
                }
            }
            for(Map.Entry entry:map.entrySet()){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
            System.out.println(Invalid+" : "+Invalid);
        }
    }
}