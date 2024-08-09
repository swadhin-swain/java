//create a class circle and use inheritance to create another class.
class Circle{
    public int radius;
  Circle(int r){
    this.radius=r;
    System.out.println("I am a circle parameterized constructor.");
  }
  public double area(){
    return Math.PI*radius*radius;
  }
}
class Cylinder1 extends Circle{
   public int height;
   Cylinder1(int r,int h){
    super(r);
     this.height=h;
         System.out.println("I am a cylinder1 parameterized constructor.");
   }
   public double volume(){
    return Math.PI*radius*radius*height;
   }
}
public class Inheritance_Qns1 {
    public static void main(String[] args) {
        Cylinder1 c=new Cylinder1(4, 05);
        System.out.println("The volume of the cylinder1 is "+c.volume());
        System.out.println("The area of the circle is "+c.area());
    }
}