package com.linqxxy.git;

import java.util.Stack;


public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node){
        stack1.push(node);
    }
    public int pop() {
        if (stack1.isEmpty()&&stack2.isEmpty()){
           throw new UnsupportedOperationException("队列为空");
        }
        if (!stack2.isEmpty()){
            return stack2.pop();
        }else {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
}