package com.linqxxy.git;
import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
    private int ticket=20000;
    @Override
    public void run() {
        for(int i=0;i<20000;i++){
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(10);
                        System.out.println(Thread.currentThread().getName() + "还剩下" + ticket-- + "票");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
