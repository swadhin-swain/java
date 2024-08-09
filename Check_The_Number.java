//check the user enter number is greater than the given number or not
import java.util.Scanner;
public class Check_The_Number {
    public static void main(String[] args) {
     int givenNumber=12;
     Scanner p=new Scanner(System.in);
     System.out.println("enter the number");
     int userEnterNumber=p.nextInt();
     System.out.println(userEnterNumber>givenNumber); 
     p.close();
    }
}
