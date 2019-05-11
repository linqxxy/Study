package top.linqxxy.wwh4;
//函数接口：有且仅有一个抽象方法，可以通过函数接口使用lambda表达式
public class TestDemo {
    public static void main(String[] args) {
        int a=2;
        int b=1;
        Add add=(x,y) -> x+y;
        System.out.println(add.sum(a,b));
    }
}
