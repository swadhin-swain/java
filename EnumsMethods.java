// Example of enum methods
enum Months { // we can declare the enum inside the class also.
    JAN,FEB,MAR,APRIL; // semi colon is optional
}

public class EnumsMethods {
    public static void main(String[] args) {
        Months[] m = Months.values();

        for(Months m1 : m) {
            System.out.println(m1+"---"+m1.ordinal());
        }

        // values() method are used to create an arrays of enums
        // ordinal() methods are used to know the order of enums
    }
}
