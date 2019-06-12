package com.linqxxy.git;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class TestScheduledThreadPoolExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService service= Executors.newScheduledThreadPool(5);
        service.schedule(()->{
            System.out.println(Thread.currentThread().getName()+" "+LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd"+"HH:mm:ss")));
        })
    }
}
