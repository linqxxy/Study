package TestDemo1.bit.src;

public class TestStack {
    public static void main(String[] args) {
        IMyStackImpl iMyStack=new IMyStackImpl(5);
        System.out.println(iMyStack.empty());
        iMyStack.push(0);
        iMyStack.push(1);
        iMyStack.push(2);
        iMyStack.push(3);
        iMyStack.push(4);
        System.out.println(iMyStack.peek());
        while (!iMyStack.empty()){
            System.out.print(iMyStack.pop());
        }
    }
}
