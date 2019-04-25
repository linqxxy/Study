package TestDemo2.bit.src;

public class MyQueueImpl implements  IMyQueue {
    private  Node front;
    private Node rear;
    private int usedSize;
    private class Node {
        private int data;
        private Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public MyQueueImpl(){
        this.front=null;
        this.rear=null;
        this.usedSize=0;
    }
    @Override
    public boolean empty() {
        return this.usedSize==0;
    }

    @Override
    public int peek() {
        if(empty()){
            throw new UnsupportedOperationException("队列为空");
        }
        return this.front.data;
    }

    @Override
    public int poll() {
        if(empty()){
            throw new UnsupportedOperationException("队列为空");
        }

        int data=front.data;
        if(front==rear){
            front=null;
            rear=null;
        }else {
            front = front.next;
        }
        usedSize--;
        return data;
    }

    @Override
    public void add(int item) {
        Node node=new Node(item);
        if(empty()){
            this.front=node;
            this.rear=node;
        }else{
            this.rear.next=node;
            this.rear=node;
        }
        this.usedSize++;
    }

    @Override
    public int size() {
        return this.usedSize;
    }
}
