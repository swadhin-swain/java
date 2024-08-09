//check the year is leap year or not.
import java.util.Scanner;
public class Leap_year {public static void main(String[] args) {
     Scanner p=new Scanner(System.in);
   System.out.println("enter the year:");
   int year=p.nextInt();
   if(year%400==0||year%4==0&&year%100!=0){
    System.out.println(year+" is a leap year.");
   }
   else{
    System.out.println(year+" is not a leap year.");
   }
   p.close();
}
}  

