package com.linqxxy.git;

public class subStr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
       boolean[] arr=new boolean[n];
       for(int i=0;i<p.length;i++){
           if(s.contains(p[i])){
               arr[i]=true;
           }else {
               arr[i]=false;
           }
       }
       return arr;
    }
}