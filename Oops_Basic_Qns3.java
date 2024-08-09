//create aclass of rectangle and print their area and perimeter.
class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
} 
public class Oops_Basic_Qns3 {
    public static void main(String[] args) {
    Rectangle ABCD=new Rectangle();
    ABCD.length=10;
    ABCD.breadth=5;
    System.out.println("The area of the ABCD is "+ABCD.area());
   System.out.println("The perimeter of the ABCD is "+ABCD.perimeter());
    }
    
}
