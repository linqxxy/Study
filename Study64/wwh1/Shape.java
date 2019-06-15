package com.linqxxy.git.wwh1;

public class Shape {
    public Shape(int i){ System.out.println("Shape Constructure"); }
    void dispose(){ System.out.println("Shape dispose"); }
}
class Circle extends Shape{
    public Circle(int i){
        super(i);
        System.out.println("Circle Constructure");
    }
    void dispose(){
        System.out.println("Circle dispose");
        super.dispose();
    }
}
class Triangle extends Shape{
    public Triangle(int i){
        super(i);
        System.out.println("Triangle Constructre");
    }
    void dispose(){
        System.out.println("Triangle dispose");
        super.dispose();
    }
}
class Line extends Shape{
    private int start,end;
    public Line(int start,int end){
        super(start);
        this.start=start;
        this.end=end;
        System.out.println("Line Constructure");
    }
    void dispose(){
        System.out.println("Line dispose");
        super.dispose();
    }
}
class CADSystem extends Shape{
    private Circle c;
    private Triangle t;
    private Line[] lines=new Line[3];
    public CADSystem(int i){
        super(i+1);
        for(int j=0;j<lines.length;j++){
            lines[j]=new Line(j,j*j);
        }
        c=new Circle(1);
        t=new Triangle(1);
        System.out.println("CADSystem Constructure");
    }
    void dispose(){
        System.out.println("CADSystem dispose");
        t.dispose();
        c.dispose();
        for (int j=0;j<lines.length;j++){
            lines[j].dispose();
        }
        super.dispose();
    }
}
