public class Methods_Overloading {
    static void foo(){
        System.out.println("good morning bro!");
    }
    static void foo(int a){
        System.out.println("good morning "+a+" bro");
    }
    static void foo(int a, int b){
         System.out.println("good morning "+a+" bro");
          System.out.println("good morning "+b+" bro");
    }
    public static void main(String[] args) {
        foo();
        foo(5);
        foo(1,54);
    }
}
