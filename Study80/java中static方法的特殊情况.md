# java中static方法的特殊情况

最近在做题的时候遇见了一些坑，写出来避免以后再次遇见。

```java
package com.linqxxy.git;
class Demo{
    public static void display(){
        System.out.println("Demo.method");
    }
}
public class Test {
    public static void hello(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Demo demo=null;
        ((Test)null).hello();
        demo.display();
    }
}

```

![1562733638377](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1562733638377.png)

结果显示，可以正常编译，并且也没有运行时异常出现。

最早在做题的时候，忽略了static这个关键字，从而导致了在审题的时候出现偏差，选择了会出现空指针异常。这里的方法都是用static关键字修饰的，其调用根本不依赖该类产生的对象，只需要通过类名来调用即可。

还有一个是null可以被强制转换为各种类型，通过这样的方法可以执行该类型的静态方法，但是调用普通方法同样会产生空指针异常。

