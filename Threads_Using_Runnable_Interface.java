//creating threads using runnable interface.
class MyThreadRunnable1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("I am a thread 1 not a threat 1.");
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("I am a thread 2 not a threat 2.");
        }
    }
}

public class Threads_Using_Runnable_Interface {
    public static void main(String[] args) {
        // creating objects.
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
