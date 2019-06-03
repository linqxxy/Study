package com.linqxxy.git.wwh1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyPrintStream {
    private OutputStream out;
    public MyPrintStream(OutputStream out){
        this.out=out;
    }
    public void write(int value) {
        this.write(String.valueOf(value));
    }
    public void write(double value) {
        this.write(String.valueOf(value));
    }
    public void flush() {
        try {
            this.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void write(String value) {
        byte[] data = value.getBytes();
        try {
            this.out.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try (
                OutputStream out = new FileOutputStream(
                        "F:" + File.separator + "test" + File.separator + "myprint.txt"
                )
        ) {
            MyPrintStream myPrintStream = new MyPrintStream(out);
            myPrintStream.write(65);
            myPrintStream.write(10.5);
            myPrintStream.write("HelloWorld");
            myPrintStream.flush();
        } catch (IOException e) {

        }
    }
}
