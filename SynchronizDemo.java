class Display{
    public static synchronized void wish(String name) {
        for(int i=0;i<10;i++) {
            System.out.print("Good morning: ");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
            System.out.println(name);
        }
    }
}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}
public class SynchronizDemo {
    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();
        MyThread t1 = new MyThread(d1, "Dhoni");
        MyThread t2 = new MyThread(d2, "Yuvraj");

        t1.start();
        t2.start();
    }
}
