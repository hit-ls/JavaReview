package Javabase;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/19 22:56
 */
public class 线程同步锁修饰代码块 {


        public static void main(String[] args) {
            System.out.println("使用关键字synchronized");
            SyncThread syncThread = new SyncThread();
            Thread thread1 = new Thread(syncThread, "SyncThread1");
            Thread thread2 = new Thread(syncThread, "SyncThread2");
            thread1.start();
            thread2.start();
        }
}
class SyncThread implements Runnable {
    private static int count;
    public SyncThread() {
        count = 0;
    }
    public  void run() {
//        synchronized (this)
            {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("线程名:"+Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public int getCount() {
        return count;
    }
}
