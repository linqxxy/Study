package com.linqxxy.git.wwh2;

import java.util.Random;

class Value {
    int i;
    public Value(int i){this.i=i;}
}
public class FinalData{
    private static Random rand=new Random(47);
    private String id;
    private final int valueOne=9;
    private static final int VALUE_TWO=99;
    public static final int VALUE_THREE=39;
    private final  int i4=rand.nextInt(20);
    private final int INT_5=rand.nextInt(20);
    private Value v1=new Value(11);
    private final Value v2=new Value(22);
    private static  final Value v3=new Value(33);
    private final int[] a={1,2,3,4,5,6};
    public FinalData(String id){this.id=id;}
    public String toString(){
    return id+": " + " i4 = " + i4 +",INT_5="+INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1=new FinalData("fd1");
        fd1.v2.i++;
        fd1.v1=new Value(9);
        for(int i=0;i<fd1.a.length;i++){
            fd1.a[i]++;
        }
        System.out.println(fd1);
        System.out.println("===========");
        FinalData fd2=new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}
