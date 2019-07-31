package com.linqxxy.test;

import java.util.Scanner;
public class Test05 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int gradePoint[]=new int[n];//每门课学分
        int coursePoint[]=new int[n];//每门课分数

        for(int i=0;i<n;i++){
            gradePoint[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            coursePoint[i]=in.nextInt();
        }
        in.close();
        System.out.printf("%.2f",gradePointAverage(gradePoint,coursePoint));//格式输出

    }
    public static double pointOfEachCourse(int grade){//根据实际成绩判断学分方法
        double point = 0.0;
        if(grade>=90&&grade<=100)
            point=4.0;

        if(grade>=85&&grade<=89)
            point=3.7;

        if(grade>=82&&grade<=84)
            point=3.3;

        if(grade>=78&&grade<=81)
            point=3.0;

        if(grade>=75&&grade<=77)
            point=2.7;

        if(grade>=72&&grade<=74)
            point=2.3;

        if(grade>=68&&grade<=71)
            point=2.0;

        if(grade>=64&&grade<=67)
            point=1.5;

        if(grade>=60&&grade<=63)
            point=1.0;

        if(grade<60)
            point=0.0;

        return (double)point;
    }
    //计算平均绩点的方法
    public static double gradePointAverage(int[] gradePoint,int[] coursePoint){
        double gradePointTotal=0;
        double gradeOfEachCourseTotal=0;
        for(int i=0;i<gradePoint.length;i++){
            gradePointTotal+=pointOfEachCourse(coursePoint[i])*gradePoint[i];
            gradeOfEachCourseTotal+=gradePoint[i];
        }
        return (double)gradePointTotal/gradeOfEachCourseTotal;
    }
}
