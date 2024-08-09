
//Example of exception class
import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class MaxAgeException extends Exception {
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "make sure that the value of age entered is correct";
    }
}

public class Exception_Class {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = p.nextInt();
        if (a < 9) {
            try {
                throw new MyException();
                // throw new ArithmeticException("this is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("Yes finished");
        }
        p.close();
    }
}
