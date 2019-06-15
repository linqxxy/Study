package com.linqxxy.git.wwh2;

public class TestGenericity {
    public static void main(String[] args) {
        Point<Integer,String> point=new Point<>(1,"北纬36");
        Point<String,Float> point1=new Point<>();
        point1.setX("东经120");
        point1.setY(120.1f);
        System.out.println(point.add("是真哒"));
        System.out.println(point);
        System.out.println(point1);
    }
}
class Point<T,V>{
    private T x;
    private V y;
    public Point(){ }
    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public V getY() {
        return y;
    }

    public void setY(V y) {
        this.y = y;
    }
    public <T> T add(T x){
        return x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
