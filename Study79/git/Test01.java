package com.linqxxxy.git;

import java.util.Scanner;

public class Test01 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int length;

            while (scanner.hasNextInt()) {

                length = scanner.nextInt();

                int[] index = new int[length];

                System.out.println(coutIndex(length, index));

            }

        }

        public static int coutIndex(int l, int[] index) {

            int i = 0;

            int count = 0;

            int countDel = 0;

            while (true) {

                if (countDel == l) {

                    return i - 1;

                }

                if (i == l) {

                    i = i % l;

                }

                if (index[i] != -1) {

                    count++;

                }

                if (count == 3) {

                    count = 0;

                    countDel++;

                    index[i % l] = -1;

                }

                i++;

            }

        }
}

