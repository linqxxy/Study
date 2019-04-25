package TestDemo2.bit.src;

public class MyStack {
    private MyQueueImpl myQueue1;
    private MyQueueImpl myQueue2;
    private int usedSize;
    public MyStack(){
        this.myQueue1=new MyQueueImpl();
        this.myQueue2=new MyQueueImpl();
        this.usedSize=0;
    }
    /** Push element x onto stack. */
    public void push(int x) {
        if (myQueue1.empty()&&myQueue1.empty()){
            myQueue1.add(x);
        }else if(!myQueue1.empty()){
            myQueue1.add(x);
        }else {
            myQueue2.add(x);
        }
        this.usedSize++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(empty()){
            throw new UnsupportedOperationException("栈空");
        }
        int oldData=0;
        if(!myQueue1.empty()){
            for(int i=0;i<myQueue1.size()-1;i++){
                myQueue2.add(myQueue1.poll());
            }
            oldData =myQueue1.poll();
        }else {
            for(int i=0;i<myQueue2.size()-1;i++){
                myQueue1.add(myQueue2.poll());
            }

            oldData=myQueue2.poll();
        }
        usedSize--;
        return oldData;
    }

    /** Get the top element. */
    public int top() {
        if(empty()){
            throw new UnsupportedOperationException("栈空");
        }
        int data=0;
        if(!myQueue1.empty()){
           for(int i=0;i<usedSize-1;i++){
               data=myQueue1.peek();
                myQueue2.add(myQueue1.poll());
            }
            } else {
            for(int i=0;i<usedSize-1;i++){
                data = myQueue2.peek();
                myQueue1.add(myQueue2.poll());
            }
        }
        return data;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
    return usedSize==0;
    }
}

