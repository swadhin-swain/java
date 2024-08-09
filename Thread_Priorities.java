//check the priorities of threads
class MyThread5 extends Thread{
    public MyThread5(String name){
        super(name);
    }
    public void run(){
        int i=1;
        while (i<=100) {
            System.out.println("The Thread name is "+this.getName());
            i++;
        }
    }
}
public class Thread_Priorities {
    public static void main(String[] args) {
        MyThread5 t1=new MyThread5("swadhin");
        MyThread5 t2=new MyThread5("Abhijit");
        MyThread5 t3=new MyThread5("Pabitra");
        MyThread5 t4=new MyThread5("Tapas");
        MyThread5 t5=new MyThread5("siba(most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
