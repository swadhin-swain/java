class Display{
    public synchronized void wish(String name) {
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
public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Dhoni");
        MyThread t2 = new MyThread(d, "Yuvraj");

        t1.start();
        t2.start();
    }
}
