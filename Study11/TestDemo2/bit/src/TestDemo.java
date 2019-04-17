package TestDemo2.bit.src;

public class TestDemo {
    public static void main(String[] args) {
        MySquence mySquence=new MySquence();
        mySquence.add(0,"A");
        mySquence.add(1,"B");
        mySquence.add(2,"C");
        mySquence.add(3,"D");
        mySquence.add(3,"Hello");
        mySquence.remove("D");
        mySquence.display();
        System.out.println(mySquence.search("C"));
        System.out.println(mySquence.contain("Hello"));
        mySquence.clear();
        System.out.println(mySquence.size());
    }
}
