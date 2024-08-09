//print 1 to n and n enter by the user.
import java.util.Scanner;
public class For_Loop {
    public static void main(String[] args) {
       Scanner p=new Scanner(System.in);
       System.out.println("enter the value of n:");
       int n=p.nextInt();
       for(int i=1;i<=n;i++){
        System.out.println(i);
       } 
       p.close();
    }
}
