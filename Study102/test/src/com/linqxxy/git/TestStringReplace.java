package com.linqxxy.git;

import java.util.Scanner;

public class TestStringReplace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(replaceSpace(str,str.length()));
    }
    public static String replaceSpace(String iniString, int length) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<iniString.length();i++){
            if(iniString.charAt(i)==' '){
                sb.append("20%");
            }else{
                sb.append(iniString.charAt(i));
            }
        }
        return sb.toString();
    }
}
