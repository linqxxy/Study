package TestDemo3.bit.src;

public class TestCQueue {
    public static void main(String[] args) {
        CQueue cQueue=new CQueue();
        System.out.println(cQueue.isEmpty());
        cQueue.enQueue(1);
        cQueue.enQueue(2);
        cQueue.enQueue(3);
        cQueue.enQueue(4);
        cQueue.enQueue(5);
        cQueue.enQueue(6);
        cQueue.enQueue(7);
        cQueue.enQueue(8);
        cQueue.enQueue(9);
        cQueue.enQueue(10);
        System.out.println(cQueue.Rear());
        System.out.println(cQueue.isFull());
    }
}
