package TestDemo3.bit.src;

public class TestSequence {
    public static void main(String[] args) {
        MySequence mySequence=new MySequence();
        mySequence.add(0,"A");
        mySequence.add(1,"B");
        mySequence.add(2,"C");
        mySequence.add(3,"D");
        mySequence.add(4,"E");
        mySequence.add(5,"F");
        mySequence.add(0,"first");
        mySequence.disPlay();
        mySequence.remove("B");
        System.out.println(mySequence.contain("first"));
        System.out.println(mySequence.search("C"));
        mySequence.disPlay();
        mySequence.clear();
        mySequence.disPlay();

    }
}
