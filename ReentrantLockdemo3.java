import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

class MyThread extends Thread {
    static ReentrantLock l = new ReentrantLock();
    MyThread(String name) {
        super(name);
    }

    public void run() {
        do {
            try{
                if (l.tryLock(5000,TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName()+"...got lock");
                    Thread.sleep(30000);
                    l.lock();
                    System.out.println(Thread.currentThread().getName()+"..releases lock");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName()+"..unable to get lock");
                }
            
            } catch(Exception e) {

            }
        }  while(true);
    }
}

public class ReentrantLockdemo3 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("firstThread");
        MyThread t2 = new MyThread("secondThread");

        t1.start();
        t2.start();
    }    
}
