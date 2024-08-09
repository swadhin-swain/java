//Example of throw and throws.
class NegativeRadiusxception extends Exception {
    @Override
    public String getMessage() {
        return "radius cannot be negative.";
    }
}

public class Throw_Throws {
    public static double area(int r) throws NegativeRadiusxception {
        if (r < 0) {
            throw new NegativeRadiusxception();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        // code by pinu
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        try {
            int c = divide(6, 3);
            System.out.println(c);
            double d = area(-4);
            System.out.println(d);
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e.getMessage());
        }
    }
}
