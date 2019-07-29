import java.util.Scanner;
import java.text.DecimalFormat;
public class Test03 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum1=0;
        int sum2=0;
        int count2=0;
        int sum3=0;
        int sum4=0;
        int sum5=0;
        double avg=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            int x=arr[i]%5;
            switch (x){
                case 0: {
                    if (arr[i]%2==0){
                        sum1+=arr[i];
                    }
                    break;
                }
                case 1: {
                    count2++;
                    if(count2%2==1){
                        sum2+=arr[i];
                    }else {
                        sum2-=arr[i];
                    }
                    break;
                }
                case 2:  sum3++;break;
                case 3: {
                    sum4++;
                    avg+=arr[i];
                    break;
                }
                case 4: {
                    sum5++;
                    if(arr[i]>max){
                        max=arr[i];
                    }
                    break;
                }
            }
        }
        if(sum1==0){
            System.out.print("N"+" ");
        }else{
            System.out.print(sum1+" ");
        }
        if(sum2==0){
            System.out.print("N"+" ");
        }else{
            System.out.print(sum2+" ");
        }
        if(sum3==0){
            System.out.print("N"+" ");
        }else{
            System.out.print(sum3+" ");
        }
        if(sum4==0){
            System.out.print("N"+" ");
        }else{
            DecimalFormat df=new DecimalFormat("#.0");
            System.out.print(df.format(avg/sum4)+" ");
        }
        if(sum5==0){
            System.out.print("N"+" ");
        }else{
            System.out.print(max+" ");
        }
    }
}