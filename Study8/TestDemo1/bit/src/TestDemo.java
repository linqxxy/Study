package TestDemo1.bit.src;

public class TestDemo {
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inter inter=new Outer.Inter(outer);
        inter.func1();
    }
}
