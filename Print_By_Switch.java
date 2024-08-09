//print the name using switch
import java.util.Scanner;
public class Print_By_Switch {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("enter your initial letter");
        char ch=p.next().charAt(0);
        switch(ch){
            case 's':System.out.println("your name is swadhin");
                     break;
            case 't':System.out.println("your name is tapas");
                     break;
            case 'S':System.out.println("your name is shiv");
                     break;
            default: System.out.println("enter correct letter");         
        }
        p.close();
    }
}
