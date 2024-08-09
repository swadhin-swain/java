//create a try catch method for exception to know the reason of exception.
public class Exception_Try_Catch {
    public static void main(String[] args) {
        int a = 40000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("The result of c is " + c);
        } catch (Exception e) {
            System.out.println("We failed to devide.Reason");
            System.out.println(e);
        }
    }
}
