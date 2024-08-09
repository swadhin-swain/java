//check the number is pallindrome or not.
import java.util.Scanner;
public class Palliandrome {
   public static void main(String[] args) {
    Scanner p=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=p.nextInt();
    int r,s=0;
    int c=n;
    while(n>0){
      r=n%10;
      s=s*10+r;
      n=n/10;
    }
    if(c==s){
        System.out.println(s+" is a palliandrome number.");
    }
    else{
        System.out.println(c+" is not a pallindrome number.");
    }
    p.close();
   } 
}
