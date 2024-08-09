//write a java method  to print to print mutiplication table of a number n.
import java.util.Scanner;
public class Methods_Qns1 {
    static void print(int a){
        for(int i=1;i<=10;i++){
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
    System.out.println("enter the value of n:");
    int n=p.nextInt();
print(n);
p.close();
    } 
}
