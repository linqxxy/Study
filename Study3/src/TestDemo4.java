class OuterClass4{
    private int age;
    private String name;
    public static int data=11;
    public OuterClass4(){
        System.out.println("外部类构造函数");
    }
    public void print(){
        class Inter{//本地内部类，不允许被修饰符修饰
            public  static final int age=10;
            public Inter(){
                System.out.println("内部类构造函数");
            }
        }
        new Inter();
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        OuterClass4 outerClass4=new OuterClass4();
        outerClass4.print();
    }
}