
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        String s1=scanner1.next();
        String s2=scanner1.next();
    }
    public static String stringSub(String str1, String str2) {
        for (int i = 0; i < str2.length(); i++) {
            int idx = 0;
            while ((idx = str1.indexOf(str2.charAt(i))) != -1) {
                str1 = str1.substring(0, idx) + str1.substring(idx + 1);//将第idx字符删除掉
            }
        }
        return str1;
    }
}
