package com.linqxxy.git.wwh1;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestMethod {
    public static void main1(String[] args) {
        new Thread(()->{
            System.out.println("start"+LocalDateTime.now());
            for(int i=0;i<10;i++){
                Thread.currentThread().setName("线程"+i);
                System.out.println(Thread.currentThread().getName()+"  "+i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                Thread.yield();
            }
            System.out.println("end "+LocalDateTime.now());
        }).start();
    }
    public static void main2(String[] args) {
        Thread thread=new Thread(new RunableJoin(),"线程B");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"中的代码");

    }
    public static void main3(String[] args) {
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date));
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
    public static void main4(String[] args) {
        RunableStop runableStop=new RunableStop();
        Thread thread=new Thread(runableStop,"Thread_stop");
        thread.start();
        System.out.println(Thread.currentThread().getName()+"Code");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //runableStop.setFlag(false);
        //thread.stop();
        thread.interrupt();
        System.out.println("代码执行完了");
    }
    public static void main5(String[] args) {
        Thread thread=new Thread(()-> System.out.println(Thread.currentThread().getName()+"优先级"
        +Thread.currentThread().getPriority()),"测试线程");
        thread.start();
        System.out.println(Thread.currentThread().getPriority());
        new Thread(() -> {
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            new Thread((() -> System.out.println(Thread.currentThread().getName()+"优先级"
                    +Thread.currentThread().getPriority()))).start();
            System.out.println(Thread.currentThread().getName()+"优先级"
                    +Thread.currentThread().getPriority());
        }).start();
    }
    public static void main(String[] args) {
        Thread thread=new Thread(() -> {
            while (true){
                System.out.println(Thread.currentThread().getName()+" "+LocalDateTime.now());
            }
        },"守护进程");
        thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main代码结束");
    }
}
