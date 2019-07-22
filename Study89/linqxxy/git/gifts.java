package com.linqxxy.git;

public class gifts {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2};
        System.out.println(getValue(arr, arr.length));
    }

    public static int getValue(int[] gifts, int n) {
        int tmp = gifts[0];
        int count = 1;


        for (int i = 1; i < n; i++) {
            if (gifts[i] == tmp) {
                count++;
            } else {
                count--;
            }

            if (count == 0)
            {
                tmp = gifts[i];
                count = 1;
            }
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (gifts[i] == tmp) {
                c++;
            }
        }
        if (c > (n / 2))
            return tmp;
        else
            return 0;

    }
}