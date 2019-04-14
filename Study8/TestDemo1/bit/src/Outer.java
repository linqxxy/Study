package TestDemo1.bit.src;

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
        System.out.println("Outer.func()");
    }
    static class Inter{
        private static int age2=10;
        private String name2;
        private Outer outer;
        public Inter(Outer outer){
            this.outer=outer;
            System.out.println("Inter.init()");
        }
        public Inter(){
            System.out.println("Inter.init()");
        }
        public void func1(){
            outer.func();
            System.out.println("Inter.func()");
        }
    }
}
