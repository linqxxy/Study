package com.linqxxy.git.wwh2;
//可变参数编程
public class Add {
    public static void main(String[] args) {
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4,5));
        System.out.println(add(1,2,3,4,5,6,7));

    }
    public static int add(int...a){
        int ret=0;
        for (int i=0;i<a.length;i++){
            ret+=a[i];
        }
        return ret;
    }
}
