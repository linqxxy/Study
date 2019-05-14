package com.linqxxy.git.wwh1;

public class TestStatic {
    public static void main(String[] args) {
        IUtill1<Integer,String> iUtill1=(p)-> String.valueOf(p);
        String str=iUtill1.convert(1);
        System.out.println(str);
        /*
        * y=f(x)
        * f->{}
        * f=String::valueOf()
        * f(x)
        */
        IUtill1<Integer ,String> iUtil2=String::valueOf;
        System.out.println(iUtil2.convert(10));
    }
}
