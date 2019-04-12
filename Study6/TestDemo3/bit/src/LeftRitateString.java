package TestDemo3.bit.src;

import java.util.Arrays;

class LeftRotateString {
    public static String leftRotateString(String str,int n){
        char[] arr=str.toCharArray();
        StringBuffer str2=new StringBuffer();
        for(int i=n;i<arr.length;i++){
            str2.append(arr[i]);//利用StringBuffer.append将旋转后的字符串放在新的字符串前面
        }
        for(int i=0;i<n;i++){
            str2.append(arr[i]);//将旋转前的字符串放在新的字符串后面
        }
        return str2.toString();
    }
}
