package test1.wwh.src.util;
//泛型方法与泛型类没有关系，互相独立，始终以自己定义的类型为准。（建议用不同的字母）
//方法中使用到泛型类作为函数参数，可以使用？通配符，表示参数的类型参数具体类型为任意类型，但在方法中不能修改
//参数值
//定义一个类属性和方法参数通过类型参数定义，在使用时明确类型.
//类型参数的具体类型必须是引用数据类型。
public class Point3<T> {
    private T x;
    private T y;
    public <T> void printPoint(T t){
        System.out.println(t);
    }
    public <T,E> void printPoint(T t,E e){
        System.out.println(t);
        System.out.println(e);
    }
}
