package com.linqxxy.git.wwh1;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println(Thread.currentThread().getName() + "运行第"+i+"次");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
