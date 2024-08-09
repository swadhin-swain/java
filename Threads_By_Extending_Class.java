//creating threads by extending class.
class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("My cooking Thread is running now.");
            System.out.println("I am Happy.");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thread2 for chatting with her.");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class Threads_By_Extending_Class {
    public static void main(String[] args) {
        // creating the object for Thread1.
        MyThread1 m1 = new MyThread1();
        // creating object for Thread2.
        MyThread2 m2 = new MyThread2();
        m1.start();
        m2.start();

    }
}
