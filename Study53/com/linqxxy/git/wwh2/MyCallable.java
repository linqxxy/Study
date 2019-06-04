package com.linqxxy.git.wwh3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    private int tick=10;
    private String title;
    public MyCallable(String title){
        this.title=title;
    }
    @Override
    public Object call() throws Exception {
        while (tick>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if (this.tick>0) {
                    System.out.println(Thread.currentThread().getName() + "买了一张票,剩余" + (--tick));
                }
            }
        }
        return "票卖光了";
    }
}
