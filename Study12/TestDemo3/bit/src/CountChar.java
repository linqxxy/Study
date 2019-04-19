package TestDemo3.bit.src;

import java.util.Scanner;

public class CountChar {
    public static char func(String str){
        int hash[]=new int[256];
        char[] chars=str.toCharArray();
        int i;
        for( i=0;i<chars.length;i++){
            char ch=chars[i];
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='B'){
                hash[ch]++;
                if (hash[ch]==3){
                    return ch;
                }
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(func(scanner.nextLine()));
    }
}
