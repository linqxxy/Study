import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] str=scanner.nextLine().split(" ");
        System.out.println(num(str));

    }
    public static int num(String[] str){
        int[] arr=new int[str.length];
        int[] count=new int[255];
        int ret=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(str[i]);
            count[arr[i]]++;
        }
        for(int i=0;i<count.length;i++){
            if (count[i]>=(arr.length/2)){
             ret =i;
            }
        }
        return ret;
    }
}
