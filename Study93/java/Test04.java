import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grade = new int[n];
        int[] credits = new int[n];
        for (int i = 0; i < n; i++) {
            credits[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            grade[i] = sc.nextInt();
        }
        System.out.printf("%.2f",GPA(grade,credits));
    }

    public static double GPA(int[] grade, int[] credits) {
        double sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] >= 90 && grade[i] <= 100) {
                sum1 += (4.0 * credits[i]);
            }
            if (grade[i] >= 85 && grade[i] <= 89) {
                sum1 += (3.7 * credits[i]);
            }
            if (grade[i] >= 82 && grade[i] <= 84) {
                sum1 += (3.3 * credits[i]);
            }
            if (grade[i] >= 78 && grade[i] <= 81) {
                sum1 += (3.0 * credits[i]);
            }
            if (grade[i] >= 75 && grade[i] <= 77) {
                sum1 += (2.7 * credits[i]);
            }
            if (grade[i] >= 72 && grade[i] <= 74) {
                sum1 += (2.3 * credits[i]);
            }
            if (grade[i] >= 68 && grade[i] <= 71) {
                sum1 += (2.0 * credits[i]);
            }
            if (grade[i] >= 64 && grade[i] <= 67) {
                sum1 += (1.5 * credits[i]);
            }
            if (grade[i] >= 60 && grade[i] <= 53) {
                sum1 += (1.0 * credits[i]);
            }
            if (grade[i] < 60) {
                sum1 += (0 * credits[i]);
            }
            sum2 += credits[i];
        }
        return sum1/sum2;
    }
}