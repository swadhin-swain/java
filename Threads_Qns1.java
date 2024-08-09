//WAP to print "Good Morning" and "welcome" contineously on the screnn in java using threads.
class Swadhin extends Thread{
    public void run(){
        // while(false){
        //     System.out.println("Good Morning.");
        //     try{
        //         Thread.sleep(200);
        //     }
        //     catch(Exception e){
        //         System.out.println(e);
        //     }
        // }
    }
}
class Abhijit extends Thread{
    public void run(){
        // while(false){
        //     System.out.println("WelCome.");
        // }
    }
}
public class Threads_Qns1 {
    public static void main(String[] args) {
        Swadhin s=new Swadhin();
        Abhijit a= new Abhijit();
        System.out.println(s.getState());
         s.start();
         a.start();
          System.out.println(s.getState());
          System.out.println(s.getState());
    }
}
