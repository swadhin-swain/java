//calculate the factorial of n.
import java.util.Scanner;
public class Recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }
   public static void main(String[] args) {
    Scanner p=new Scanner(System.in);
    System.out.println("Enter the number to find the factorial:");
    int a=p.nextInt();
    System.out.println("The factorial of "+a+" is "+factorial(a)+".");
    p.close();
   } 
}
