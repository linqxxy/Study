package TestDemo1.bit.src;

public class MyStackImpl implements IMyStack {
    private Object[] elem;
    private int top;
    private int useSize;
    public MyStackImpl(){
        this.elem=new Object[10];
        this.top=0;
        this.useSize=0;
    }
    public MyStackImpl(int  size){
        this.elem=new Object[size];
        this.top=0;
        this.useSize=0;
    }
    private boolean isFull(){
        return useSize==this.elem.length;
    }
    @Override
    public void push(Object item) {
        if(isFull()){
            throw new UnsupportedOperationException("栈满");
        }
        this.elem[top]=item;
        top++;
        this.useSize++;
    }

    @Override
    public Object pop() {
        if(empty()){
            throw new  UnsupportedOperationException("栈为空");
        }
        this.useSize--;
        top--;
        return this.elem[top];
    }

    @Override
    public Object peek() {
        if(empty()){
            throw new  UnsupportedOperationException("栈为空");
        }
        return this.elem[top-1];
    }

    @Override
    public boolean empty() {
        return this.useSize==0;
    }

    @Override
    public int size() {
        return this.useSize;
    }
    public void clear(){
        for(int i=0;i<this.elem.length;i++){
            this.elem[i]=null;
        }
    }
}
