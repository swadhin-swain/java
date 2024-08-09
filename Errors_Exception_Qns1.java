//Write a java program to demonstrate syntax,logical,runtime errors
public class Errors_Exception_Qns1 {
    public static void main(String[] args) {
      //  int a=9--->syntax error
      //logical error
      int age=56;
      int born_year=2000-age;
      //runtime error
      System.out.println(6/0);
    }
}
