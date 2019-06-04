package com.linqxxy.git.wwh2;

public class TestMyThread {
    public static void main(String[] args) {
//        System.out.println("main方法的开始");
//        MyThread myThread1=new MyThread("mythread1  ");
//        MyThread myThread2=new MyThread("mythread2  ");
//        MyThread myThread3=new MyThread("mythread3  ");
//        myThread1.start();
//        myThread2.start();
//        myThread3.start();
//        Runnable runnable1=new MyRunable("myrunable1");
//        Thread thread1=new Thread(runnable1);
//        Thread thread2=new Thread(runnable1);
//        Thread thread3=new Thread(runnable1);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("main方法的结束");
        new Thread(() -> {
            for(int i=0;i<10;i++){
                System.out.println("Thread1  "+i);
            }
        }).start();
        new Thread(() -> {
            for(int i=0;i<10;i++){
                System.out.println("Thread2  "+i);
            }
        }).start();
    }

}
