//create a class square with a method to initialize its side ,calculating area and perimeter.
class Square{
   int side;
   public int area(){
    return side*side;
   }
   public int perimeter(){
    return 4*side;
   }
}
public class Oops_Basic_Qns2 {
    public static void main(String[] args) {
        Square ABCD=new Square();
        ABCD.side=10;
        System.out.println("The area of the ABCD is "+ABCD.area());
        System.out.println("The perimeter of the ABCD is "+ABCD.perimeter());
    }
}
