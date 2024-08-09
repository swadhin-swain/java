import java.util.*;
public class Dates {
    public static void main(String[] args) {
        System.out.println("The years since 1970 is "+System.currentTimeMillis()/1000/3600/24/365);
        long a=System.currentTimeMillis();
        System.out.println(Long.MAX_VALUE);
        System.out.println(a);
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
    }
}