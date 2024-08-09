//check the character input by user is integer or not
import java.util.Scanner;
public class Check_The_Input {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("check the given character is integer or not");
        boolean check=p.hasNextInt();
        System.out.println(check);
        p.close();
    }
}
