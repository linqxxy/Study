# 1 深浅拷贝

```java
import java.io.Serializable;

class Teacher{
    private String name;
    private Integer age;
}
class Student extends Teacher implements Serializable {
    private String name;
    private Integer age;
    private Teacher teacher;
    public Student clone(){
        Student stu=null;
        try {
            stu= (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return stu;
    }
}


```



* 深拷贝：拷贝对象内部的引用也会产生新对象。
* 浅拷贝：拷贝对象内部引用复用，不会产生新对象。
  * 实现深拷贝
    1. 递归实现Cloneable接口
    2. 使用序列化（推荐）

# 2 内存区域划分

## 线程私有：

随着线程创建而创建，随着线程结束而回收，生命周期与线程相同，不同线程隔离。

* 程序计数器：记录当前线程锁执行的字节码行数，唯一一块不产生 OOM 的区域，native方法在程序计数器中值为0。

* 虚拟机栈：java方法的内存模型。-Xss 设置栈的大小 StackOverflow OOM

  1. 递归函数：

     ​					——语义：函数能干吗

     ​					——出口在哪：（终止条件）不写或者条件不合适会产生StackOverflow

* 本地方法栈：本地方法的内存模型。

  HotSpot 本地方法栈与虚拟机栈合二为一。

## 线程共享

* 堆（GC堆）：所有的对象实例以及数组实例。-Xms设置堆的最小值。-Xmx设置堆的最大值
* 方法区（JDK8之前称为永久代，后称为元空间）：静态变量、常量、加载的类信息
  * 运行时常量池（方法区的一部分）：符号引用、字面量。

# 3 垃圾回收

判断对象是否存活->对象是否原地去世（finalize()）-去世>如何回收已不再存货的对象

## 判断对象是否存活

* 引用计数法（C++智能指针，PythonGC）：无法解决循环引用的问题（java没有采用）。
  * 循环引用：两个对象之间互相有对方的引用。
* 可达性分析算法
  * GC Roots（可以作为GC Roots）
    1. 类中的静态变量和常量。
    2. 栈中的局部变量。
  * JDK1.2*****之后关于引用的扩充*****
    * 强：程序中普遍存在的，类似Test test=new Test();只要对象被强引用指向，GC无法回收此对象（即使内存溢出）。
    * 软：描述有用但不必须的对象（缓存对象），JDK1.2   SoftReference来描述软引用。当对象仅被软引用指向，内存够用时不回收，即将发生OOM，一次性回收所有仅被软引用所指向的对象。
    * 弱：仅能存活到下一次GC之前，GC开始时，无论内存是否够用，都会回收掉仅被弱引用指向的对象。JDK1.2 WeakRerference来描述弱引用。
    * 虚：与对象的生存周期无关，当对象被GC时，由JVM发回一个回收通知，JDK1.2 PhatomRerference描述虚引用。

## 对象自我拯救finalizee();

* final、finally和finalize区别
  * final：用于声明属性，方法和类，分别表示属性不可变，方法不可覆盖和类不可被继承（不能再派生出新的子类）
  * finally：作为异常处理的一部分，他只能在try/catch语句时，并且附带一个语句块，表示这段语句语句最终一定能被执行，经常被用在需要释放资源的情况下。
  * finalize: 是Object类的一个方法，在垃圾回收执行器执行时会调用被回收对象的finalize方法，可以覆盖此方法来实现对其他资源的回收，例如关闭文件。需要注意：一旦垃圾回收器准备好释放对象占用的空间，将首先调用其finalize方法，并且在下一次垃圾回收动作发生时，才会真正回收对象占用的内存。

## 如何进行垃圾回收

java采用分代回收算法，将内存划分为新生代和老年代。

* 新生代(对象默认在新生代产生，对象存活率较低)：采用复制算法，（Eden，Survivor（From To））
* 老年代(对象存活率较高)：采用 标记—整理算法。
* 请解释MinorGC与FullGC（Major GC）
  * MinorGC从年轻代空间（包括Eden与Survivor区域），回收内存被称为MinorGC，每次MinorGC会清理年轻代内存。
  * MajorGC是清理永久代。FullGC是清理整个堆空间—包括年轻代与永久代。
  * MinorGC触发条件：
    * 当Eden区满是，触发MinorGC。
  * FullGC触发条件：
    * 调用System.GC，系统建议执行FullGC，但是不必然执行。
    * 老年代空间不足
    * 方法去空间不足
    * 通过MinorGC后进入老年代的平均大小大于老年代的可用内存。
    * 由Eden区、FromSpace区向ToSpace区复制时，对象内存大于ToSpace可用内存，则把该对象转存到老年带，且老年代的可用内存小于该对象大小。