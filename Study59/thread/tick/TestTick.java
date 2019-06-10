package com.bittech.thread.tick;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Author: secondriver
 * Created: 2019/6/3
 */
public class TestTick {
    
    public static void code1() {
        //1.卖票  10
        //2.多个黄牛 共同去买 10
//        Thread thread1 = new MyTickThread("黄牛A");
//        Thread thread2 = new MyTickThread("黄牛B");
//        thread1.start();
//        thread2.start();
        
        //多线程共享，线程安全性，并发修改问题
//        Runnable runnable = new MyTickRunnable();
//
//        Thread thread1 = new Thread(runnable);
//        Thread thread2 = new Thread(runnable);
//
//        thread1.start();
//        thread2.start();
        
        Callable<String> runnable = new MyTickCallable();
        FutureTask<String> futureTask = new FutureTask<>(runnable);
        
        //Thread  -> run
        //FutureTask -> Callable -> call
        //FutureTask -> run  (call)
        Thread thread1 = new Thread(futureTask);
        Thread thread2 = new Thread(futureTask);
        
        thread1.start();
        thread2.start();
        
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        
        //共享
        //读数据
        //更新数据（同步）
        Runnable runnable = new MyTickRunnable();
        
        Thread thread1 = new Thread(runnable);
        thread1.setName("黄牛A");//run (runnable.run())
        Thread thread2 = new Thread(runnable);
        thread2.setName("黄牛B");
        Thread thread3 = new Thread(runnable);
        thread3.setName("黄牛C");
        
        thread1.start();
        thread2.start();
        thread3.start();
        
    }
}
