package com.linqxxy.git.wwh1;

public class TestWait {
   static final public Object obj=new Object();
    public static void main(String[] args) {
        Runnable runnable=new MyRunable();
        Thread thread1=new Thread(runnable,"通知进程");
        Thread thread2=new WaitThread();
        thread2.setName("等待进程");
        thread2.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main方法运行结束");
    }
}
