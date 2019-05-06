package test1.wwh.src.util;
//提供两个类型参数，亦可以是多个，类中可以继续定义指定类型的参数
public class Point2<T,E> {
    private T x;
    private E y;

    public E getY() {
        return y;
    }

    public void setY(E y) {
        this.y = y;
    }

    public T getX() {

        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
