//enter the marks of a student in 5 subjects and calculate their percentage
import java.util.Scanner;
public class Percentage_Of_Marks {
    public static void main(String[] args) {
       Scanner p=new Scanner(System.in);
       System.out.println("enter your mark in subject1:");
       float mark1=p.nextFloat(); 
       System.out.println("enter your mark in subject2:");
       float mark2=p.nextFloat(); 
       System.out.println("enter your mark in subject3:");
       float mark3=p.nextFloat(); 
       System.out.println("enter your mark in subject4:");
       float mark4=p.nextFloat(); 
       System.out.println("enter your mark in subject5:");
       float mark5=p.nextFloat(); 
       float percentage=(mark1+mark2+mark3+mark4+mark5)/5;
       System.out.println("the percentage is "+percentage+"%");
       p.close();
    }
    
}
