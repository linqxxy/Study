package com.linqxxy.git.wwh2;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void code1(){
        Queue<Goods> queue=new LinkedList<>();
        Runnable producer=new Producer(queue);
        Runnable consumer=new Consumer(queue);
        for(int i=0;i<1;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Thread(producer,"生产者"+i).start();
        }
        for(int i=0;i<3;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Thread(consumer,"消费者"+i).start();
        }
    }
    public static void main(String[] args) {
        code1();
    }
}
