//create a class cellphone with methods to print ringing...,vibrating... etc.
class Cellphone{
    public void call(){
        System.out.println("calling...mantu.");
    }
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
}
public class Oops_Basic_Qns1 {
    public static void main(String[] args) {
        Cellphone realme=new Cellphone();
        realme.call();
        realme.ring();realme.vibrate();
    }
}
