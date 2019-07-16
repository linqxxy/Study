package com.linqxxy.git;

import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            StringBuilder res= new StringBuilder();
            int begin;
            if(a%2==1){
                begin=a*a-2*(a/2);
            }else{
                begin=a*a-2*(a/2)+1;
            }
            res.append(begin);
            for(int i=1;i<a;i++)
                res.append("+").append(begin + 2 * i);
            System.out.println(res);
        }
    }
}
