package com.linqxxy.git.wwh3;

public class MyTickRunable implements  Runnable {
    int tick=10;
    String title;
    public MyTickRunable(String title){
        this.title=title;
    }
    @Override
    public void run() {
        while (tick>0){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if (this.tick>0) {
                    System.out.println(Thread.currentThread().getName() + "买了一张票,剩余" + (--tick));
                    if (tick==0){
                        System.out.println("票卖光了");
                    }
                }
            }
        }
    }
}
