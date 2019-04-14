package TestDemo2.bit.src;

public class Son extends Parent{
    private String school;
    public Son(){
        System.out.println("Son.init()");
    }
    {
        System.out.println("Son.instance()");
    }
    static{
        System.out.println("Son.static");
    }
    public void func(){
        System.out.println("Son.func()");
    }
}
