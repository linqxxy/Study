package com.linqxxy.git;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.nextLine();
            char[] b = a.toCharArray();
            int i;
            for (i = 0; i < b.length; i++) {
                char c = b[i];
                if (c - 'A' >= 0) {
                    c = (char) (c > 'E' ? (c - 5) : (c + 21));
                    b[i] = c;

                }
            }
            System.out.println(new String(b));
        }
    }
}
