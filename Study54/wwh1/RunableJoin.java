package com.linqxxy.git.wwh1;

import java.time.LocalDateTime;

class  RunableJoin implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行时间："+LocalDateTime.now());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这里有大量代码");
        System.out.println(Thread.currentThread().getName()+"结束执行时间："+LocalDateTime.now());
    }
}
