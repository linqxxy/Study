package TestDemo.bit.src;

class  Person{ }
public class TestDemo {//Comparable接口（学习）
    public  static  void func(Object object){
        System.out.println(object);//默认调用Object的toString方法
    }
    public static void main(String[] args) {
        Object obj=new int[]{1,2,3,4};
        Object obj1=new double[]{1.0,2.9,3.8,4.7};
    }
}
