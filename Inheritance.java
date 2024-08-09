//example of inheritance
class Base{
   int x;
   public void setx(int n){
    System.out.println("I am in base and setting the value of x.");
    this.x=n;
   }
   public int getx(){
    System.out.println("I am in base and return the value of x");
    return x;
   }
}
   //inherit the method and properties.
   class Derived extends Base{
     int y;
     public void sety(int n){
        System.out.println("I am in derived and setting the value of y.");
        this.y=n;
     }
     public int gety(){
       System.out.println("I am in derived and return the value of y");
       return y; 
     }
   
}
public class Inheritance {
    public static void main(String[] args) {
        //creating the object.
        Base b=new Base();
       Derived d=new Derived();
       b.setx(10);
       System.out.println(b.getx());
       d.setx(20);
       System.out.println(d.getx());
       d.sety(22);
       System.out.println(d.gety());
    }
}
