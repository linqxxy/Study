package com.inqxxy.git;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int count = 0;
        for(int i = 0;i<h;i++){
            int j =0;
            if(i/2%2 !=0){
                j=2;
            }
            for(;j<w;j+=4){
                if(j+1<w){
                    count +=2;
                }else{
                    count+=1;
                }
            }
        }
        System.out.println(count);

    }
}