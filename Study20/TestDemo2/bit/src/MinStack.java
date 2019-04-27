package TestDemo2.bit.src;

public class MinStack {
    private MyStackImpl minStack;
    private MyStackImpl stack;
    public MinStack(){
        this.minStack=new MyStackImpl();
        this.stack=new MyStackImpl();
    }
    public void push(int item){
        stack.push(item);
        if(minStack.empty()||minStack.peek()>=item){
            minStack.push(item);
        }
    }
    public int pop(){
        int data=stack.pop();
        if(minStack.peek()==data){
            minStack.pop();
        }
        return data;
    }
    public int peek(){
        return stack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
}
