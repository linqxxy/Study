class OuterClass2{
    private int age;
    private String name;
    public static int data=11;
    public OuterClass2(){
        System.out.println("外部类构造函数");
    }
    class Inter{
        public static final int age=10;//实例内部类定义静态成员变量必须使用final修饰
        public Inter(){
            System.out.println("内部类构造函数");
        }
        public Inter(int age,String name){
            OuterClass2.this.age=age;//实例内部了消耗了额外的内存空间，因为实例内部类具有外部类的this引用
            OuterClass2.this.name=name;
        }
        public void print(){
            System.out.println("内部类成员方法");
        }
    }
    public void print(){
        System.out.println("外部类成员方法");
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        OuterClass2.Inter inter=new OuterClass2().new Inter();//实例内部类的实例化需要借助外部类对象
        inter.print();
    }
}