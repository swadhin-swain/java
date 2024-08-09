//WAP to print the multiplication table of a numer enter by the user.
import java.util.Scanner;
public class Conditional_Statement_Qns5 {
   public static void main(String[] args) {
    Scanner p=new Scanner(System.in);
    System.out.println("enter the number");
    int number=p.nextInt();
    for(int i=1;i<=10;i++){
        System.out.println(number+"*"+i+"="+number*i);
    }
    p.close();
   } 
}
