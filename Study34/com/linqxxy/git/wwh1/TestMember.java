package com.linqxxy.git.wwh1;

public class TestMember {
    public static void main(String[] args) {
        //IUtill3<Integer,Integer> iUtill3=(p1,p2)->p1-p2;
        IUtill3<Integer,Integer>iUtill31=Integer::compareTo;
        System.out.println(iUtill31.compare(10000,123));
    }
}
