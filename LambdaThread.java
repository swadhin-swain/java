public class LambdaThread {
    public static void main(String[] args) {
        Runnable r = ()->{
            for(int i=0;i<10;i++) {
                System.out.println("Child thread with Lambda's");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for(int i=0;i<10;i++) {
            System.out.println("Main THread");
        }
    }    
}
