package com.bittech.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: secondriver
 * Created: 2019/6/8
 */
public class TestThreadLocal {
    
    private static String commonStr;
    
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    private static List<String> list = new ArrayList<>();
    
    public static void code1() {
        //main 线程
        commonStr = "main";
        threadLocal.set("main-thread-value");
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                commonStr = "threadA";
                threadLocal.set("A-thread-value");
                System.out.println(Thread.currentThread().getName() + "  commonStr = " + commonStr);
                System.out.println(Thread.currentThread().getName() + "  threadLocal = " + threadLocal.get());
            }
        }, "Thread-A")
                .start();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(Thread.currentThread().getName() + "  commonStr = " + commonStr);
        System.out.println(Thread.currentThread().getName() + "  threadLocal = " + threadLocal.get());
    }
    
    
    public static void code2() {
        //        commonStr
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                //String不可变
                String copyCommonStr = commonStr;
                copyCommonStr = "hello";

//                final List<String> copyList =new ArrayList<>();
//                copyList.addAll(list);
                
                //JDK
                
            }
        });
    }
    
    public static void main(String[] args) {
//        ThreadLocal<String> threadLocal = ThreadLocal.withInitial(()->"hello");

//        ThreadLocal<String> threadLocal = new ThreadLocal<>();
//        new Thread(() -> System.out.println(threadLocal.get())).start();
//        new Thread(() -> System.out.println(threadLocal.get())).start();

//        ThreadLocal<String> threadLocal = new ThreadLocal<String>() {
//            @Override
//            protected String initialValue() {
//                return "hello";
//            }
//        };
//        new Thread(() -> System.out.println(threadLocal.get())).start();
        
        
        ThreadLocal<String> threadLocal = ThreadLocal.withInitial(() -> "hello");//lambda 匿名类的实例化对象 方法引用
        new Thread(new MyRunnableThreadLocal(threadLocal)).start();
        threadLocal = null;
    }
}

class MyRunnableThreadLocal implements Runnable {
    
    private final ThreadLocal threadLocal;
    
    MyRunnableThreadLocal(ThreadLocal threadLocal) {
        this.threadLocal = threadLocal;
    }
    
    
    @Override
    public void run() {
        this.threadLocal.get();
        this.threadLocal.set("Hello");
    }
}