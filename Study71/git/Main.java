package com.linqxxy.git;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str1;
        String str2;
        Scanner scanner=new Scanner(System.in);
        str1=scanner.nextLine();
        str2=scanner.nextLine();int count = 0;
        if(isPlindrome(str1+str2,0,str2.length()+str1.length()-1)){
            count++;
        }
        for(int i = 1;i<str1.length();i++){
            if(isPlindrome(str1.substring(0,i)+str2+str1.substring(i),0,str2.length()+str1.length()-1)){
                count++;
            }
        }
        if(isPlindrome(str1+str2,0,str2.length()+str1.length()-1)){
            count++;
        }
        System.out.println(count);
    }
    public static boolean isPlindrome(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
