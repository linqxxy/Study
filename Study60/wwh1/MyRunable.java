package com.linqxxy.git.wwh1;

public class MyRunable implements Runnable {
    private final Object obj=TestWait.obj;
    @Override
    public void run() {
        synchronized (obj){
            System.out.println(Thread.currentThread().getName()+"：通知");
            obj.notify();
            System.out.println(Thread.currentThread().getName()+"：结束");
        }
    }
}
