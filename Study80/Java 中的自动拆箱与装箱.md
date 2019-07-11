# Java 中的自动拆箱与装箱

## 1. 基本数据类型以及包装类

​       我们都知道，java是一门面向对象的编程语言，所有的new出来的对象都存放在堆上，通过栈上该对象的引用来访问该对象。所以对象是比较浪费资源的，因此java中引入了基本数据类型的概念。这些数据类型不需要通过new来创建，直接放在栈上，使用起来更高效一些，但是java毕竟是一门面向对象的编程语言，而这些基本数据类型却不是面向对象的，所以Java中引入了包装类的概念，每一种基本数据类型都对应着其自己的包装类。

* #### 整型

  1. ##### byte-------->Byte         (-128     127)                    默认值  0

  2. ##### short------->Short        (-32768  32767)                           0

  3. ##### int----------->Integer     (-2^31  2^31-1)                           0

  4. ##### long--------->Long         (-2^63   2^63-1)                           0或0L

* #### 浮点型

  1. ##### float--------->Float        (4 字节)                                      0.0f

  2. ##### double------>Double    (8字节)                                       0.0d

* #### 字符型

  * ##### char----------->Character (2字节)                                  '\u0000'

* 布尔型

  * ##### boolean------->Boolean (1位)                                        false

实际运用的时候,整型通常采用int型,而小数通常采用double型。

### 2. java中初始化默认值的规则

* 类的成员变量：不管程序中有没有显式的初始化，虚拟机都会先自动给它初始化为默认值。引用数据类型初始化为null。
* 局部变量：局部变量只有显式的初始化之后才可以使用，虚拟机不会自动初始化为默认值，当检测到使用了未初始化的局部变量时，编译器将会报错。

总结一句话就是，类中的成员变量也叫属性，属性可以不用赋予初值，若不赋初值则虚拟机会自动给与默认值；方法中定义的变量在参与运算之前必须要赋值。

### 3. 拆箱与装箱

* 拆箱：将包装类型转换为基本类型称为拆箱。

  ```java
  int i=integer.intValue();
  ```

  

* 装箱：将基本类型转换为包装类型称为装箱。

  ```java
  Integer integer=new Integer(10);
  ```

### 4 自动拆箱与装箱

​		为了开发人员方便，在 jdk1.5 之后加入了自动拆箱与装箱的操作，由于这种机制的存在，使得包装类之间可以相互运算。

​		

```java
Integer i = 10;//自动装箱底层调用Integer.valueOf(10);
int j =i;//自动拆箱底层调用i.intValue();
```

​		总结：自动装箱操作是通过包装类的valueOf()方法实现的，自动拆箱操作是通过 （数据类型）+Value实现的。

#### 5 包装类型的比较

​		前面我们说了，包装类型产生的是对象，而对象的比较我们通常使用的是equals方法，而基本数据类型使用的是==。

```java
package com.linqxxxy.git;

public class Test {
    public static void main(String[] args) {

        int i = new Integer(300);
        Integer integer = new Integer(300);
        System.out.println(i == integer);
        System.out.println(integer.equals(i));
        System.out.println("----------------------");
        Integer integer1 = 30;
        Integer integer2 = 30;

        if (integer1 == integer2)
            System.out.println("integer1 == integer2");
        else
            System.out.println("integer1 != integer2");
        System.out.println("-----------------");
        Integer integer3 = 300;
        Integer integer4 = 300;

        if (integer3 == integer4)
            System.out.println("integer3 == integer4");
        else
            System.out.println("integer3 != integer4");
    }
}

```

![1562731521368](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1562731521368.png)

​		从运行结果我们可以看出，在用基本类型和包装类型作比较时候，会发生自动拆箱。在包装类型与包装类型作比较时，不同的数值得到的结果也不相同，这是由于在-128到127之间的时候，采用包装类型会采用缓存对象，而不是重新创建一个对象，这个范围我们可以自己修改。因此，包装类型进行比较的时候采用==会有不确定性，所以在进行包装类比较的时候尽量采用equals方法进行比较。