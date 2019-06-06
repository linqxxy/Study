package com.linqxxy.git.wwh1;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TestThread {
    static void code1(){
        Callable callable=new MyCallable();
        FutureTask futureTask1=new FutureTask(callable);
        FutureTask futureTask2=new FutureTask(callable);
        Thread thread=new Thread(futureTask1,"黄牛1");
        Thread thread1=new Thread(futureTask2,"黄牛2");
        thread.start();
        thread1.start();
    }
    static void code2(){
        Runnable runnable=new MyRunable();
        Thread thread1=new Thread(runnable,"黄牛1");
        Thread thread2=new Thread(runnable,"黄牛2");
        thread1.start();
        thread2.start();
    }
    static  void code3(){
        TestCallable callable=new TestCallable();
        FutureTask futureTask=new FutureTask(callable);
        FutureTask futureTask1=new FutureTask(callable);
        Thread thread1=new Thread(futureTask,"线程1");
        Thread thread2=new Thread(futureTask1,"线程2");
        thread1.start();
        thread2.start();
    }
    public static void main(String[] args) {
        code1();
    }
}
