//Create a thread constructor.
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
int i=34;
System.out.println("Thank You!");
// while(i<50){
//     System.out.println("I am a Thread.");
//     i++;
// }
    }
}
public class Thread_Constructer {
    public static void main(String[] args) {
        MyThr t1=new MyThr("swadhin");
        MyThr t2= new MyThr("Abhijit");
        t1.start();
        System.out.println("The thread1 id is "+t1.getId());
        System.out.println("The thread2 id is "+t2.getId());
        System.out.println("the thread 1 name is "+t1.getName());
        System.out.println("the thread 2 name is "+t2.getName());
    }
}
