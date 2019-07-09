package com.linqxxxy.git;
public class TestDemo {
    public static void main(String[] args) {
        TestHeap testHeap=new TestHeap();
        int[]arr={1,2,3,4,5,21,23,53,22,121,123};
        testHeap.initHeap(arr);
//        testHeap.pushHeap(8);
//        System.out.println(testHeap.popHeap());
//        testHeap.HeapSort();
        testHeap.show();
    }
}
