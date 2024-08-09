//create class cylinder and use getters and setters to set its radius and height.
class Cylinder{
    private int radius;
    private int height;
    //setters
    public void setRad(int n){
        this.radius=n;
    }
    public void setHeight(int n){
        this.height=n;
    }
    //getters
    public int getRad(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
}
public class Getters_Setters_Qs {
    public static void main(String[] args) {
        Cylinder indane=new Cylinder();
        indane.setRad(5);
        indane.setHeight(10);
        System.out.println("The radius of the indane is "+indane.getRad());
         System.out.println("The height of the indane is "+indane.getHeight());
    }
}
