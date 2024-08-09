class MyThread extends Thread {

}

public class ThreadName {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        t1.setName("Swadhin Swain");

        System.out.println(t1.getName());

        Thread.currentThread().setName("Pinu");
        System.out.println(Thread.currentThread().getName());
    }
}
