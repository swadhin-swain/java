
//to input from the user
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        // input integer
        System.out.println("enter the first number:");
        int number1 = p.nextInt();
        System.out.println("enter the first number:");
        int number2 = p.nextInt();
        int sum = number1 + number2;
        System.out.println("the sum of two number is " + sum);
        // input string
        System.out.println("enter your name");
        String name = p.next();
        System.out.println("your name is " + name);
        System.out.println("enter a sentence");
        String sentence = p.nextLine();
        System.out.println("the sentence is: " + sentence);
        // input float
        System.out.println("enter your cgpa");
        float cgpa = p.nextFloat();
        System.out.println("your cgpa is " + cgpa);
        p.close();
    }

}
