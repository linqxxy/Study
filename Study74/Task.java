import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task implements Runnable {
    private Lock lock=new ReentrantLock();
    @Override
    public void run() {
        try {
            lock.lock();
            lock.lockInterruptibly();
            while (true){

            }
        }catch (Exception e){
            System.out.println("线程中断");
            e.printStackTrace();
            return;
        }finally {
            lock.unlock();
            System.out.println("锁已释放");
        }
    }
}
