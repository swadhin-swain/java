@FunctionalInterface
interface Interf {

    public void add(int a, int b);
    
    default void m2(){
        System.out.println("default method");
    }
    
    static void m(){
        System.out.println("static method");
    }
}

// class Demo implements Interf {
 
//     public void add(int a, int b){
//         System.out.println(a+b);
//     }
// }

public class Lambda2 {
    public static void main(String[] args) {

        // Interf i = new Demo();
        // i.add(5, 6);

        Interf i = (a,b)->System.out.println("The sum is "+(a+b));
       i.add(5,6);
       i.add(100, 200);
       i.add(1000, 2000);
       i.m2();
       Interf.m();
       
    }
}
