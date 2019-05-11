package top.linqxxy.www;

import java.util.Scanner;

public class MessageImpl implements IMessage<String> {
    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
