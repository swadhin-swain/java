class Base1{
    Base1(){
        System.out.println("I am a base1 constructor.");
    }
    Base1(int x){
        System.out.println("I am a base1 overloaded constructor with value "+x);
    }
}
class Derived1 extends Base1{
   Derived1(){
    System.out.println("I am a derived1 constructor.");
   }
   Derived1(int x,int y){
    super(x);
    System.out.println("I am a derived1 overloaded constructer with value "+y);
   }
}
class ChildOfDerived1 extends Derived1{
   ChildOfDerived1(){
    System.out.println("I am a ChildOfDerived1 constructor.");
   }
   ChildOfDerived1(int x,int y,int z){
    super(x,y);
    System.out.println("I am a ChildOfDerived1 overloaded constructor with value "+y);
   }
   
}
public class Constructors_In_Inheritance {
   public static void main(String[] args) {
    //ChildOfDerived1 c=new ChildOfDerived1();
    ChildOfDerived1 c=new ChildOfDerived1(45,76,44);
   } 
}
