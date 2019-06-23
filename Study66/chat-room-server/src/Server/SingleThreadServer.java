package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SingleThreadServer {
    public static void main(String[] args) {
        int port=4406;
        try {
            ServerSocket serverSocket=new ServerSocket(port);
            System.out.println("服务器运行在"+serverSocket.getLocalSocketAddress());
            System.out.println("等待客户端连接ing");
            //等待客户端连接
            Socket socket= serverSocket.accept();
            //数据的接收和发送
            InputStream in=socket.getInputStream();
            Scanner scanner=new Scanner(in);
            System.out.println("客户端说"+scanner.nextLine());
            OutputStream out=socket.getOutputStream();
            PrintStream printStream=new PrintStream(out);
            printStream.println("欢迎，欢迎");
            printStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
