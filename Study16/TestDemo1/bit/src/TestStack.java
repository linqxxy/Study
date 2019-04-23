package TestDemo1.bit.src;

public class TestStack {
    public static void main(String[] args) {
        IMyStackImpl iMyStack=new IMyStackImpl(10);
        iMyStack.push(0);
        iMyStack.push(1);
        iMyStack.push(2);
    }
}
