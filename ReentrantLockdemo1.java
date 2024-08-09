import java.util.concurrent.locks.*;
class Display {
    ReentrantLock l = new ReentrantLock();
    public void wish(String name) {
        l.lock();
        for(int i=1;i<=10;i++) {
            System.out.print("good morning : ");
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e) {

            }
            System.out.println(name);
        }
        l.unlock();
    }
}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d=d;
        this.name=name;
    }

    public void run() {
        d.wish(name);
    }
} 

public class ReentrantLockdemo1 {
    public static void main(String[] args) {
        Display d = new Display();

        MyThread t1 = new MyThread(d, "Dhoni");
        MyThread t3 = new MyThread(d, "Yuvraj");
        MyThread t2 = new MyThread(d, "Kohli");

        t1.start();
        t2.start();
        t3.start();

    }
}
