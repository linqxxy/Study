package TestDemo2.bit.src;

import java.util.Scanner;

public class TestMinStack {
    public static void main1(String[] args) {
        IsVaild isVaild=new IsVaild();
        Scanner scanner=new Scanner(System.in);
        System.out.println(isVaild.isValid(scanner.nextLine()));
    }
    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(-1);
        minStack.push(1);
        minStack.push(2);
        System.out.println(minStack.getMin());
        System.out.println(minStack.peek());
        System.out.println(minStack.pop());
        System.out.println(minStack.getMin());
    }
}
