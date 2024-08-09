import java.util.concurrent.locks.*;

class MyThread extends Thread {
    static ReentrantLock l = new ReentrantLock();

    MyThread(String name) {
        super(name);
    }

    public void run() {
        if (l.tryLock()) {
            try {
                System.out.println(Thread.currentThread().getName() + ".....got lock and performing safe operation");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                l.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + ".....unable to get the lock and hence performing alternative operations");
        }
    }
}

public class ReentrantLockdemo2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("firstThread");
        MyThread t2 = new MyThread("secondThread");

        t1.start();
        t2.start();
    }
}
