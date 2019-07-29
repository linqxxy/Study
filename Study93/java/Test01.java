import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sale = sc.nextLine();
        String want = sc.nextLine();
        int num = 0;
        int lackNumber = 0;
        StringBuffer ab = new StringBuffer(sale);
        StringBuffer arb = new StringBuffer(want);
        for (int i = 0; i < arb.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < ab.length(); j++) {
                if (arb.charAt(i) == ab.charAt(j)) {
                    num++;
                    flag = false;
                    ab.deleteCharAt(j);
                    break;
                }
            }
            if (flag) {
                lackNumber++;
            }

        }
        if (num == arb.length()) {
            System.out.print("Yes" + " " + (sale.length() - arb.length()));
        } else {
            System.out.print("No" + " " + (lackNumber));
        }

    }

}
