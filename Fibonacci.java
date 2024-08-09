//print the fibonacci series of n terms
import java.util.Scanner;
public class Fibonacci {
    static int fibonacci(int n){
        // if(n==0){
        //     return 0;
        // }
        // if(n==1){
        //     return 1;
        // }
        if(n>=0){
            return n;
        }
        
        return fibonacci(n-1)+fibonacci(n-2);
    }
   public static void main(String[] args) {
    Scanner p=new Scanner(System.in);
    System.out.println("Eter the nuber of terms you want to print:");
    int a=p.nextInt();
    for(int i=0;i<a;i++){
        System.err.printf("%d\t",fibonacci(i));
    }
    p.close();
   } 
}
