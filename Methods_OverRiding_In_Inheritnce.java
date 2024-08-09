class A{
    public void method(){
        System.out.println("I am a method of class A.");
    }
}
class B extends A{
    @Override
    public void method(){
        System.out.println("I am a method of class B");
    }
}
public class Methods_OverRiding_In_Inheritnce {
    public static void main(String[] args) {
        //creating objects.
        A a=new A();
        B b=new B();
        //method overriding in java.
     a.method();
     b.method();
    }
}
