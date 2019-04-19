package TestDemo4.bit.src;

import java.util.Scanner;

public class TestDemo {
    public  static int func(int n){
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=1;
        }
        int count=0;
        int num=n;
        while (num>1){
            for(int i=0;i<n;i++){
                if(arr[i]==1){
                    count++;
                    if (count==3){
                        arr[i]=0;
                        num--;
                        count=0;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                return  i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(func(scanner.nextInt()));
    }
}
