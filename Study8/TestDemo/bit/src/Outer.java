package TestDemo.bit.src;

public class Outer {
    private int age;
    private String name;
    public Outer(){
        System.out.println("Outer.init()");
    }
    {
        System.out.println("Outer.instance()");
    }
    static {
        System.out.println("Outer.static()");
    }
    public void func(){
        System.out.println(name+age);
    }
    class Inter{
        public static final int age2=10;
        private String name2;
        public Inter(){
            System.out.println("Inter.init()");
        }
        {
            System.out.println("Inter.instance()");
        }
        public void func(){
            System.out.println(name+age);
        }
    }
}
