public class LockTest {
    public static void main1(String[] args) {
        Object o=new Object();
        Thread thread=new Thread(()->{
            while (true){
                synchronized (o){
                //不响应中断
                }
            }
        });
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println("线程终止");
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new Task());
        thread.start();
        thread.interrupt();
    }
}
