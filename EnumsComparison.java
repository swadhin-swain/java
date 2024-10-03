import java.util.ArrayList;
import static java.lang.Math.sqrt;

enum Beer {
    KF,KO,RC,FO;
}
public class EnumsComparison {

    public static void main(String[] args) {
        System.out.println(Beer.KF.equals(Beer.RC));
        System.out.println(Beer.KF==Beer.RC);
        System.out.println(Beer.KF.hashCode()>Beer.RC.hashCode());
        // System.out.println(Beer.KF>Beer.RC);  // this provides error because we can not compare two object
        System.out.println(Beer.KF.ordinal()>Beer.RC.ordinal()); 

        ArrayList i = new ArrayList<>();
        System.out.println(sqrt(4));
    }
}