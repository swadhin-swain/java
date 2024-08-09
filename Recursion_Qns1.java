//write a recursive function to calculate the the sum of n natural number.
import java.util.Scanner;
public class Recursion_Qns1 {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return sum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the number you want ti sum:");
        int a=p.nextInt();
        System.out.println("The sum of "+a+" natural number is "+sum(a));
        p.close();
    }
    
}
