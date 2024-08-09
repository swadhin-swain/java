class myThread extends Thread {
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("child thread");
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(1);

        System.out.println(Thread.currentThread().getPriority());

        myThread t = new myThread();
        System.out.println(t.getPriority());

        t.setPriority(10);
        System.out.println(t.getPriority());

        t.start();

        for(int i=0;i<10;i++) {
            System.out.println("main thread");
        }
    }
}
