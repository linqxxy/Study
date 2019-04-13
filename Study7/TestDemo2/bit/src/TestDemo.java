package TestDemo2.bit.src;
//单例模式，构造函数必须是私有的，提供static方法获取实例化对象
/*
*1、饿汉式单例设计模式（线程安全的）
 */
class Singleton{
    private static Singleton singleton=new Singleton();
    private Singleton(){
        System.out.println("Singleton.init()");
    }
    public  static Singleton getInstance(){
        return  singleton;
    }
    public void func(){
        System.out.println("Singleton.func()");
    }
}
/*
*懒汉式单利模式(线程不安全的)
 */
class Singleton2{
    private static Singleton2 singleton2;
    private Singleton2(){
        System.out.println("Singleton2.init()");
    }
    public static Singleton2 getInstance(){
        if(singleton2==null){
            singleton2=new Singleton2();
        }
        return singleton2;
    }
    public void func(){
        System.out.println("Singleton2.function()");
    }
}
//请使用静态内部类，实现一个单例模式
class Singleton3{
    private Singleton3(){
        System.out.println("Singleton3.init()");
    }
  private  static class Single{
        public static Singleton3 singleton3=new Singleton3();
    }
    public static Singleton3 getInstance(){
        return Single.singleton3;
    }
    public void func(){
        System.out.println("Singleton3.func()");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        singleton.func();
        Singleton2 singleton2=Singleton2.getInstance();
        singleton2.func();
        Singleton3 singleton3=Singleton3.getInstance();
        singleton3.func();
        System.out.println(singleton3);
        Singleton3 singleton31=Singleton3.getInstance();
        System.out.println(singleton31);
    }
}
