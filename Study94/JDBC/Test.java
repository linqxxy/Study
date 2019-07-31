package com.linqxxy.JDBC;

import com.linqxxy.JDBC.dao.Goods;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Goods> queue=new LinkedList<>();
        DBManager dbManager=new DBManager();
        Runnable producer=new Producer(queue,dbManager);
        Runnable consumer=new Consumer(queue,dbManager);
        for (int i=0;i<2;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Thread(producer,"厂家"+i).start();
        }
        for (int i=0;i<2;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Thread(consumer,"顾客"+i).start();
        }
    }

}
