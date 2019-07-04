import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(num(n));
    }
    public static int num(int n){
        if(n%2!=0||n<6||n==10){
            return -1;
        }else {
            if(n%8==0){
                return n/8;
            }else {
                return (n/8)+1;
            }
        }
    }
}
