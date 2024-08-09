import java.util.concurrent.*;

class PrintJob implements Runnable {
    String name;
    PrintJob(String name) {
        this.name=name;
    }
    public void run() {
        System.out.println(name+".....job started by Thread "+Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e) {

        }
        System.out.println(name+".....job completed by Thread"+Thread.currentThread().getName());
    }
}
public class ExecutorDemo {

    public static void main(String[] args) {
        PrintJob[] jobs = {
            new PrintJob("durga"),
            new PrintJob("ravi"),
            new PrintJob("shiva"),
            new PrintJob("pawan"),
            new PrintJob("suresh"),
            new PrintJob("anil"),
        };

        ExecutorService service = Executors.newFixedThreadPool(3);

        for(PrintJob job:jobs) {
            service.submit(job);
        }
        service.shutdown();
    }
}