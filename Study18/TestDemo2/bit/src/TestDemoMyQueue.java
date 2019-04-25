package TestDemo2.bit.src;

public class TestDemoMyQueue {
    public static void main(String[] args) {
        MyQueueImpl myQueue=new MyQueueImpl();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        System.out.println(myQueue.peek());
        while(!myQueue.empty()){
            System.out.print(myQueue.poll());
        }
        System.out.println();
        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.top());
        while (!myStack.empty()){
            System.out.print(myStack.pop());
        }

    }
}
