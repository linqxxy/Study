package Clint;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SingleThreadClint {
    public static void main(String[] args) {
        String ip="127.0.0.1";
        int port=4406;
        Socket socket;

        {
            try {
                socket = new Socket(ip,port);
                OutputStream out=socket.getOutputStream();
                PrintStream printStream=new PrintStream(out);
                printStream.println("服务器，我来了");
                printStream.flush();
                InputStream in=socket.getInputStream();
                Scanner scanner=new Scanner(in);
                System.out.println("来自服务器的数据:"+scanner.nextLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
