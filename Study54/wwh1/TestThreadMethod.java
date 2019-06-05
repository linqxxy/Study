package com.linqxxy.git.wwh1;

public class TestThreadMethod {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        System.out.println("线程名称  "+thread.getName());
        Thread thread1=new ThreadMethod();
        thread1.setName("打印输出线程");
        thread1.start();
        for (int i=0;i<10;i++) {
            Runnable runnable = new RunableMethod();
            Thread thread2 = new Thread(runnable);
            thread2.setName("业务线程"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread2.start();
        }
    }
}
class ThreadMethod extends Thread{
    @Override
    public void run() {
        System.out.println(this.getName()+" ");
    }
}
class RunableMethod implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"  (RunableImplements)");
    }
}
