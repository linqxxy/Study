package com.linqxxy.git;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName()+" "+LocalDateTime.now().toString());
            });
        }
        executorService.shutdown();
    }
}
