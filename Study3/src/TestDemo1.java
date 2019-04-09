interface  Myinterface{
    void print();
        }
class OuterClass{
private int age;
public String name;
public void Myinterface(){
    new Myinterface() {
        @Override
        public void print() {
            System.out.println("匿名内部类实现接口");
        }
    }.print();
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
        outerClass.Myinterface();
    }
}
