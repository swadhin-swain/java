
//E12xample of handling Specific Exception.
import java.util.Scanner;

public class Handling_Specific_Exception {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 34;
        marks[1] = 44;
        marks[2] = 54;
        marks[3] = 64;
        marks[4] = 74;
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the array index you want to devide:");
        int ind = p.nextInt();

        System.out.println("Enter the number you want to divide with array index:");
        int num = p.nextInt();

        try {
            System.out.println("The value at array index you entered is " + marks[ind]);
            System.out.println("The value of array-value/number is " + marks[ind] / num);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayOutOfIndexException occured!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("some other exxception occured!");
            System.out.println(e);
        }
        p.close();
    }
}
