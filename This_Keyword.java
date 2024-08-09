//create a this keyword.
class Ekclass{
    int x;
    Ekclass(int x){
        this.x=x;
    }
    public int getx(){
        return x;
    }
}
public class This_Keyword {
   public static void main(String[] args) {
    Ekclass e=new Ekclass(54);
    System.out.println("The value of x is "+e.getx());
   } 
}
