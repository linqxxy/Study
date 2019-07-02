package com.linqxxy.git;

import java.util.Stack;

public class TestStack {
    public boolean isTrue(String s) {
        Stack<Character> stack = new Stack<>();
        int count1 = 0;
        int count2 = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                stack.push(arr[i]);
                count1++;
            }
            if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
                count2++;
            }
            if (stack.empty()) {
                continue;
            }
            if ((stack != null) && (stack.peek() == '[' && arr[i] == ']' || stack.peek() == '{' && arr[i] == '}'
                    || stack.peek() == '(' && arr[i] == ')')) {
                stack.pop();
            }
        }
        if (count1 != count2) {
            return false;
        }
        return stack.empty();
    }
}
