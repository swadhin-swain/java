// example of enum
enum Beer {  // we can declare the enum outside the class
    KF,KO,RC,FO
}

public class Enum {

    enum Months { // we can declare the enum inside the class also.
        JAN,FEB,MAR,APRIL; // semi colon is optional
    }
    public static void main(String[] args) { // we can not declare the enum inside a method
        Beer b = Beer.RC;
        Months m = Months.JAN;

        System.out.println(b); // toSting() method will execute
        System.out.println(m);
    }
}
