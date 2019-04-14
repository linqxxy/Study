package TestDemo2.bit.src;

public class Parent {
    private int age;
    private String name;
    public Parent(){
        System.out.println("parent.init()");
    }
    {
        System.out.println("parent.instance");
    }
    static {
        System.out.println("parent.static");
    }
    public void func(){
        System.out.println("parent.func()");
    }
}
