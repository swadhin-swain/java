@FunctionalInterface
interface Interf {
    public void m1();
    
    default void m2(){}
    
    static void m(){}
}

public class LambdaExpression {
    public static void main(String[] args) {
        Interf i = () -> System.out.println("m1 lambda implementation");
        i.m1();
        i.m1();
        i.m1();
        i.m1();
    }
}
