//create a class rectangle and use inheritance to create another class cuboid.
class Rectangle1{
    public int length;
    public int breadth;
    //constructor for rectangle
    Rectangle1(int l,int b){
        this.length=l;
        this.breadth=b;
        System.out.println("I am a rectangle parameterized constructor.");
    }
    public int area(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle1{
    public int height;
    Cuboid(int l,int b,int h){
        super(l,b);
        this.height=h;
         System.out.println("I am a rectangle parameterized constructor.");
    }
    public int volume(){
        return length*breadth*height;
    }
}
public class Inheritance_Qns2 {
    public static void main(String[] args) {
        Cuboid c=new Cuboid(4,5,6);
        System.out.println("the area of the rectangle is "+c.area());
         System.out.println("the volume of the cuboid is is "+c.volume());
    }
}
