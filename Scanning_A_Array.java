//enter the value of array by user.
import java.util.Scanner;
public class Scanning_A_Array {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        int [] marks=new int[5];
        for(int i=0;i<marks.length;i++){
            System.out.println("enter the value of marks["+i+"]:");
            marks[i]=p.nextInt();
        }
         for(int i=0;i<marks.length;i++){
            System.out.println("the value of marks["+i+"]= "+marks[i]);
        }
   p.close();
    }
}
