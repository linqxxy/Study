package TestDemo3.bit.src;

public class CQueue {
    private int[]elem;
    private int front;
    private int rear;
    private int usedSize;
    public CQueue(){
        this.elem=new int[10];
        this.front=-1;
        this.rear=-1;
        this.usedSize=0;
    }
    public boolean enQueue(int value) {
        if(isFull()){
            throw new UnsupportedOperationException("队列为满");
        }
        if(isEmpty()){
            front=0;
            rear=0;
            this.elem[front]=value;
        }else {
            rear=(rear+1)%elem.length;
            elem[rear]=value;
        }
        usedSize++;
    return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            throw new UnsupportedOperationException("队列为空");
        }else if(rear==front){
            rear=-1;
            front=-1;
        }else {
            front=(front-1)%elem.length;
        }
        usedSize--;
        return true;

    }

    /** Get the front item from the queue. */
    public int Front() {
        return this.elem[front];
        }

    /** Get the last item from the queue. */
    public int Rear() {
    return this.elem[rear];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
    return usedSize==0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return front==(rear+1)%this.elem.length;
    }
}
