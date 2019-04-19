package TestDemo2.bit.src;

import java.util.Scanner;

public class IsHappy {
    public static int sum(int num){
        int sum=0;
        while (num!=0){
           sum+=(num%10)*(num%10);
           num/=10;
        }
        return sum;
    }
    public static boolean isHappy(int num){
        if(num<0){
            return false;
        }
        while (num!=1){
            num=sum(num);
            if (num==4){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(IsHappy.isHappy(scanner.nextInt()));
    }
}
