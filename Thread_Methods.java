//Example of thread methods.
class MyNewThread1 extends Thread{
    public void run(){
        int i=1;
        while(i<50){
        System.out.println("thank you.");
        try{
            Thread.sleep(96);
        }
        catch(InterruptedException e){
      e.printStackTrace();
        }
        i++;
        }
    }
}
class MyNewThread2 extends Thread{
    public void run(){
        int i=1;
        while(i<50){
            System.out.println("dhanyabad.");
            i++;
        }
    }
}
public class Thread_Methods {
    public static void main(String[] args) {
        MyNewThread1 t1=new MyNewThread1();
        MyNewThread2 t2=new MyNewThread2();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
         System.out.println(e);
        }
        t2.start();
    }
}
