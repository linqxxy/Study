import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int oper = sc.nextInt();
            int[] grade = new int[num];
            for (int i = 0; i < num; i++) {
                grade[i] = sc.nextInt();
            }
            for (int i = 0; sc.hasNext() && i < oper; i++) {
                char c = sc.next().toCharArray()[0];
                int A = sc.nextInt();
                int B = sc.nextInt();
                operation(grade, c, A, B);
            }
        }
    }

    public static void operation(int[] arr, char c, int A, int B) {
        if (c == 'Q') {
            int begin = (A > B ? B : A) - 1;
            int end = (A < B ? B : A);
            int max = 0;
            for (int i = begin; i < end; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
        if (c == 'U') {
            arr[A - 1] = B;
        }
    }
}