package com.linqxxy.test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (isLengthQualified(str) &&
                    isContentQualified(str) &&
                    !hasDuplicatedString(str))
                System.out.println("OK");
            else
                System.out.println("NG");
        }
        sc.close();
    }

    public static boolean isLengthQualified(String s) {
        return s.length() > 8;
    }

    public static boolean isContentQualified(String s) {
        int num = 0;
        int lowerCase = 0;
        int upCase = 0;
        int others = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < '9' && arr[i] > '0') {
                num = 1;
            } else if (arr[i] < 'z' && arr[i] > 'a') {
                lowerCase = 1;
            } else if (arr[i] < 'Z' && arr[i] > 'A') {
                upCase = 1;
            } else {
                others = 1;
            }

        }
        return (num+lowerCase+upCase+others)>=3;

    }

    public static boolean hasDuplicatedString(String s) {
        for (int i = 0; i < s.length() - 3; i++) {
            if (s.substring(i + 3).contains(s.substring(i, i + 3)))
                return true;
        }
        return false;
    }
}
