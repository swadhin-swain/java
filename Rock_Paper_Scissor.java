/* create a rock,paper,scissor game.
Enter 0 for rock
      1 for paper
      2 for scissor
 */
import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Enter 0 for rock , 1 for paper , 2 for scissor:");
        int userInput=p.nextInt();
        int compInput=r.nextInt(3);
        if(userInput==compInput){
            System.out.println("draw");
        }
        else if(userInput==0 && compInput==2 || userInput==1 && compInput==0 || userInput==2 && compInput==1){
            System.out.println("you win");
        }
        else{
            System.out.println("computer win");
        }
        if(compInput==0){
            System.out.println("computer choice is rock.");
        }
        else if(compInput==1){
            System.out.println("computer choice is paper.");
        }
        else{
            System.out.println("computer choice is scissor.");
        }
        p.close();
    }
}
