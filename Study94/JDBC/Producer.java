package com.linqxxy.JDBC;

import com.linqxxy.JDBC.dao.Goods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Queue;

public class Producer implements Runnable {
    private Queue<Goods> queue;
    private DBManager dbManager;
    public Producer(Queue<Goods> queue,DBManager dbManager){
        this.queue=queue;
        this.dbManager=dbManager;
    }
    @Override
    public void run() {
        dbManager.getConnection();
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (queue){
                if (this.queue.size()>=5){
                    System.out.println("库存足够，停止进货");
                    try {
                        this.queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    ResultSet rs=dbManager.queryMethod("select * from goods");
                    try {
                        while (rs.next()){
                            Goods goods=new Goods();
                            goods.setName(rs.getString("Nname"));
                            goods.setId(rs.getInt("id"));
                            goods.setPrice(rs.getDouble("price"));
                            queue.add(goods);
                            System.out.println("从"+Thread.currentThread().getName()+"进货"+goods.getName());
                        }
                    }catch (SQLException e){
                        e.printStackTrace();
                    }
                    dbManager.closeDb();
                }
            }
        }
    }
}
