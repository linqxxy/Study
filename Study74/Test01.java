import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            int n=scanner.nextInt();
            if (n==0) {
               break;
            }else {
                System.out.println(count(n));
            }
        }
        scanner.close();
    }
    public static int count(int n){
        if(n<=1){
            return 0;
        }else {
          return n/2;
        }
    }
}
