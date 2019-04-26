package TestDemo1.bit.src;

public class TestMyStack {
    public static void main(String[] args) {
        StackQueue queue=new StackQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        while (!queue.empty()){
            System.out.print(queue.pop());
        }
    }
    public static void main1(String[] args) {
        MyStackImpl myStack=new MyStackImpl(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        while (!myStack.empty()){
            System.out.print(myStack.pop());
        }
    }
}
