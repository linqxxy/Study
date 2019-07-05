package com.linqxxy.git;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int kids=scanner.nextInt();
            int[]arr=new int[kids];
            for(int i=0;i<kids;i++){
                arr[i]=scanner.nextInt();
            }
            System.out.println(func(arr,kids,40,0));
            break;
        }
    }
    static int func(int[] arr,int n,int v,int index){
        if(v==0){
            return 1;
        }
        if(n==0){
            return 0;
        }else {
            return func(arr,n-1,v,index+1)+func(arr,n-1,v-arr[index],index+1);
        }
    }
}
