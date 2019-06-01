package com.linqxxy.git.wwh2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
public class TestDemo {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("Iphone", 8999.99, 10));
        orderList.add(new Order("外星人笔记本", 12999.99, 5));
        orderList.add(new Order("MacBookPro", 18999.99, 5));
        orderList.add(new Order("Java从入门到放弃.txt", 9.99, 20000));
        orderList.add(new Order("中性笔", 1.99, 200000));
        Double totalPrice=orderList.stream().mapToDouble(order -> order.getAmount()*order.getPrice())
                .reduce((sum,x)-> sum + x).orElse(0.0D);
        DoubleSummaryStatistics statistics=orderList.stream().mapToDouble(order->order.
                getPrice()*order.getAmount()).summaryStatistics();
        System.out.println("订单个数"+statistics.getCount());
        System.out.println("订单总金额"+statistics.getSum());
        System.out.println("订单最大值"+statistics.getMax());
        System.out.println("订单最小值"+statistics.getMin());
        System.out.println("订单平均值"+statistics.getAverage());
    }
}
