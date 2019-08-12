package com.linqxxy.git;

import java.util.*;

public class TestcanConstruct {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                if(scan.nextInt() == 1){
                    list.add(scan.nextInt());
                }else{
                    list.remove((Object)scan.nextInt());
                }
                canConstruct(list);
                scan.nextLine();
            }
        }
    }

    public static void canConstruct(ArrayList<Integer> list){
        if(list.size()<3){
            System.out.println("No");
            return;
        }
        Collections.sort(list);
        int len=list.size(), sum=0;
        for(int i=0; i<len-1; i++){
            sum+=list.get(i);
        }
        if(sum<=list.get(len-1)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
