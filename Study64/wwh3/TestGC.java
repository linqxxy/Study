package com.linqxxy.git.wwh3;

public class TestGC {
     private TestGC instance;
     private  byte[] data=new byte[4*1024*1024];

    public static void main(String[] args) {
        TestGC testGC1=new TestGC();
        TestGC testGC2=new TestGC();
        testGC1.instance=testGC2;
        testGC2.instance=testGC1;
        testGC1=null;
        testGC2=null;
        System.gc();
    }
}
