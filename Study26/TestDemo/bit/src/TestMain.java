import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAO BO
 * Date: 2019-04-25
 * Time: 15:04
 */
public class TestMain {
    public static void main(String[] args) {
        TestMyStack testMyStack = new TestMyStack();
        testMyStack.push(10);
        testMyStack.push(20);
        testMyStack.push(30);
        testMyStack.push(40);

        System.out.println(testMyStack.pop());//40
        System.out.println(testMyStack.top());//30
        testMyStack.push(50);
        while(!testMyStack.empty()){
            System.out.println(testMyStack.pop());
        }
    }

    public static void main2(String[] args) {
        MyQueueImpl myQueue = new MyQueueImpl();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        System.out.println(myQueue.poll());//10
        System.out.println(myQueue.peek());//20
        myQueue.add(50);
        System.out.println(myQueue.peek());//20
        System.out.println(myQueue.poll());//20

        System.out.println(myQueue.poll());//30
        System.out.println(myQueue.poll());//40
        System.out.println(myQueue.poll());//50
        System.out.println(myQueue.poll());
    }

    public static void main1(String[] args) {
        MyStackImpl myStack = new MyStackImpl(10);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        System.out.println(myStack.pop());//40
        System.out.println(myStack.peek());//30
        myStack.push(50);
        System.out.println(myStack.peek());//50
        System.out.println(myStack.pop());//50

        System.out.println(myStack.pop());//30
        System.out.println(myStack.pop());//20
        System.out.println(myStack.pop());//10
        System.out.println(myStack.pop());
    }
}
