//check you are eligible for vote or not
import java.util.Scanner;
public class If_Else {
    public static void main(String[] args) {
    Scanner p=new Scanner(System.in);
    System.out.println("enter your age"); 
    int age=p.nextInt();
    if(age>=18){
        System.out.println("you can vote");
    }
    else{
         System.out.println("you can not vote");
    }
    p.close();
    }
}
