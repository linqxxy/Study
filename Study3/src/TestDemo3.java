class OuterClass3{
    private int age;
    private String name;
    public static int data=11;
    public OuterClass3(){
        System.out.println("外部类构造函数");
    }
    static class Inter{
        public  static int age=10;//静态内部类定义静态成员变量不需要使用final修饰
        public Inter(){
            System.out.println("内部类构造函数");
        }
        public void print(){
            System.out.println("外部类成员方法");
        }
    }
    public void print(){
        System.out.println("内部部类成员方法");
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        OuterClass3.Inter inter=new OuterClass3.Inter();//静态内部类的实例化
        inter.print();
    }
}