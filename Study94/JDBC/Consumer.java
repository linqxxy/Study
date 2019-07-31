package com.linqxxy.JDBC;

import com.linqxxy.JDBC.dao.Goods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<Goods> queue;
    DBManager dbManager;

    public Consumer(Queue<Goods> queue, DBManager dbManager) {
        this.queue = queue;
        this.dbManager = dbManager;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (queue){
                if (this.queue.isEmpty()){
                    System.out.println("库存为0，进货");
                    this.queue.notifyAll();
                }else {
                    Goods goods=this.queue.poll();
                    System.out.println(Thread.currentThread().getName()+"购买了"+goods.getName());
                }
            }
        }
    }
}
