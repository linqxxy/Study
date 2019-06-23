package Server;

//import Clint.MultiThreadClint;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadServer {
    public static void main(String[] args) {
        int defaultPort=4406;//默认端口号
        int port=defaultPort;
        //端口号验证
        for (String arg:args
             ) {
            if(arg.startsWith("--port=")){
                String portStr = arg.substring("--port=".length());
                try {
                    port=Integer.parseInt(portStr);
                }catch (NumberFormatException e){
                    port=defaultPort;
                }
            }
        }
        //服务端线程池大小为当前核心数的二倍
        final ExecutorService executorService=Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        try {
            //根据传入的端口或者默认端口开启服务，等待客户端接入
            ServerSocket serverSocket=new ServerSocket(port);
            System.out.println("服务器启动");
            while (true) {
                //接入客户端
                final Socket socket = serverSocket.accept();
                //获取客户端地址
                System.out.println("客户端连接，来自：" + socket.getRemoteSocketAddress());
                executorService.execute((new ClintHandler(socket)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
