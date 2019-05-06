package test1.wwh.src.util;

public class MyMath {
     public static int sum(int a,int b){
         return a+b;
     }
     public static int sub(int a,int b){
         return a-b;
     }
     public static int div(int a,int b){
         if(b==0){
             throw new IllegalArgumentException("b作为除数不能为0");
         }
         return a/b;
     }
     public static int su(int a,int b){
         return a*b;
     }
}
