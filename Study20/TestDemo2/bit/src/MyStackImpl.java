package TestDemo2.bit.src;


public class MyStackImpl  {
    private int[] elem;
    private int top;
    private int useSize;
    public MyStackImpl(){
        this.elem=new int[10];
        this.top=0;
        this.useSize=0;
    }
    public MyStackImpl(int  size){
        this.elem=new int[size];
        this.top=0;
        this.useSize=0;
    }
    private boolean isFull() {
        return useSize == this.elem.length;
    }
    public void push(int item) {
        if(isFull()){
            throw new UnsupportedOperationException("栈满");
        }
        this.elem[top]=item;
        top++;
        this.useSize++;
    }


    public int pop() {
        if(empty()){
            throw new  UnsupportedOperationException("栈为空");
        }
        this.useSize--;
        top--;
        return this.elem[top];
    }


    public int peek() {
        if(empty()){
            throw new  UnsupportedOperationException("栈为空");
        }
        return this.elem[top-1];
    }


    public boolean empty() {
        return this.useSize==0;
    }


    public int size() {
        return this.useSize;
    }
    public void clear(){
        for(int i=0;i<this.elem.length;i++){
            this.elem[i]=0;
        }
    }
}
