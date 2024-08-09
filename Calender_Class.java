import java.util.*;
public class Calender_Class {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());//get the id of the timezone
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        Calendar d=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(d.getCalendarType());
        System.out.println(d.getTimeZone());
         System.out.println(d.getTimeZone().getID());//get the id of the timezone
         
    }
}
