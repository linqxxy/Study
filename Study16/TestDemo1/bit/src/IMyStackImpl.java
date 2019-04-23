package TestDemo1.bit.src;

public class IMyStackImpl implements IMyStack {
    private int top;
    private int[]elem;
    private int maxSize;
    public IMyStackImpl(){
        this.maxSize=10;
        this.elem=new int[10];
        this.top=0;
    }
    public IMyStackImpl(int size){
        this.maxSize=size;
        this.elem=new int[size];
        this.top=1;
    }
    @Override
    public void push(int item) {
        if(top<=maxSize){
            this.elem[top]=item;
        }else {
            throw new UnsupportedOperationException("栈满");
        }
    }

    @Override
    public int pop() {
        int ret=this.elem[top];
        top--;
        return ret;

    }

    @Override
    public int peek() {
        return this.elem[top];
    }

    @Override
    public boolean empty() {
        return top==0;
    }

    @Override
    public int size() {
        return maxSize;
    }
}
