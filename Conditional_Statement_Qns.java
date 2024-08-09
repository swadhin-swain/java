/* write a program to find out whether a student is pass or fail. If it requires total 40% and atleast 33% in each sunject to pass.
Assume 3 subjects enter by user.
 */
import java.util.Scanner;
public class Conditional_Statement_Qns {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("enter your mark in physics:");
        int mark1=p.nextInt();
        System.out.println("enter your mark in chemistry:");
        int mark2=p.nextInt();
        System.out.println("enter your mark in math:");
        int mark3=p.nextInt();
        float percentage=(mark1+mark2+mark3)/3.0f;
        System.out.println(percentage);
        if(percentage>=40.0 && mark1>=33 && mark2>=33  && mark3>=33){
            System.out.println("you are passed");
        }
        else{
            System.out.println("you are failed");
        }
        p.close();
    }
}
