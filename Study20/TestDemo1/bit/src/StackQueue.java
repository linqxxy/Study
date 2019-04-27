package TestDemo1.bit.src;

 class StackQueue {
    private MyStackImpl myStack1;
    private MyStackImpl myStack2;
    private int usedSize;
    /** Initialize your data structure here. */
     StackQueue() {
        this.myStack1=new MyStackImpl();
        this.myStack2=new MyStackImpl();
        this.usedSize=0;
    }

    /** Push element x to the back of queue. */
    void push(int x) {
        myStack1.push(x);
        usedSize++;
    }

    /** Removes the element from in front of queue and returns that element. */
    Object pop() {
        if(myStack2.empty()&&myStack1.empty()){
            throw new UnsupportedOperationException("队列为空");
        }
        if(!myStack2.empty()){
            usedSize--;
            return myStack2.pop();
        }else {
            while (!myStack1.empty()) myStack2.push(myStack1.pop());
            usedSize--;
            return myStack2.pop();
        }
    }

    /** Get the front element. */
    Object peek() {
        if(myStack2.empty()&&myStack1.empty()){
            throw new UnsupportedOperationException("队列为空");
        }
        if(!myStack2.empty()){
            return myStack2.peek();
        }else {
            while (!myStack1.empty()){
                myStack2.push(myStack1.pop());
            }
            return myStack2.peek();
        }
    }

    /** Returns whether the queue is empty. */
    boolean empty() {
        return this.usedSize==0;
    }
}
