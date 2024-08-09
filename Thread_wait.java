class myThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread_wait {
    public static void main(String[] args) throws InterruptedException {
        myThread t = new myThread();

        t.start();
        // t.join();
        t.join(10000);
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
