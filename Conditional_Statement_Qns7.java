//write a program t find the factorial of a number and the value of n enter by the user.
import java.util.Scanner;
public class Conditional_Statement_Qns7 {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=p.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("the factorial of "+n+" is "+fact);
        p.close();
    }
}
