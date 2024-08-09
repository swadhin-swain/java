//Write a java program that prints "haha" during arithmeticexception & "hehe" during an illegalarrangement exception
public class Errors_Exception_Qns2 {
    public static void main(String[] args) {
        try{
            int a=56/0;
        }
        catch(ArithmeticException e){
            System.out.println("haha");
        }
        catch(IllegalArgumentException e){
            System.out.println("hehe");
        }
    }
}
