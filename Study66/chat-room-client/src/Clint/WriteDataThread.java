package Clint;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class WriteDataThread extends Thread {
    private Socket client;

    public WriteDataThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
// 获取键盘输入
            Scanner scanner = new Scanner(System.in);
            scanner.useDelimiter("\n");
// 获取客户端输出流
            PrintStream out = new PrintStream(client.getOutputStream());
            while (true) {
                System.out.println("请输入要发送的消息..");
                String strToServer;
                if (scanner.hasNextLine()) {
                    strToServer = scanner.nextLine().trim();
                    out.println(strToServer);
// 客户端退出标志
                    if (strToServer.equals("byebye")) {
                        System.out.println("关闭客户端");
                        scanner.close();
                        out.close();
                        client.close();
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("客户端写线程异常，错误为 " + e);
        }
    }
}
