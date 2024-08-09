class ThreadB extends Thread{
    int total=0;
    public void run() {
        synchronized(this) {
            System.out.println("child thread start calcutation");
            for(int i=1;i<=100;i++) {
                total=total+i;
            }
            System.out.println("child thread giving notification");
            this.notify();
        }
    }
}

public class ThreadA {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();
        synchronized(b) {
            System.out.println("main thread trying to call wait() method");
            try{
                b.wait();
            } catch(InterruptedException e) {}
            System.out.println("main thread got notification");
            System.out.println(b.total);

        }
    }
}

