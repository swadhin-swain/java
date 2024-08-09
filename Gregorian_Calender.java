import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian_Calender {
    public static void main(String[] args) {
        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(3456));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[4]);//give the timezone according to given index
    }
}
