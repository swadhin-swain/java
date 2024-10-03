
//Write a program that allows you to keep accessing an array until a valid index is given.If max retries excced 5 print "Errors".
import java.util.Scanner;

class MaxIndReach extends Exception {
    @Override
    public String getMessage() {
        return "Errors.";
    }
}

public class Errors_Exception_Qns3 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 56;
        marks[1] = 66;
        marks[2] = 56;
        marks[3] = 76;
        marks[4] = 96;
        int ind;
        int i = 0;
        Scanner p = new Scanner(System.in);
        while (true && i < 5) {
            try {
                System.out.println("Enter the value of Index");
                ind = p.nextInt();
                System.out.println("The value of marks[ind] is " + marks[ind]);
            } catch (Exception e) {
                System.out.println("Invalid index.");
                i++;

            }
        }
        
        if (i >= 5) {
            try {
                throw new MaxIndReach();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        p.close();
    }
}
