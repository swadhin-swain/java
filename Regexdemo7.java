//program to check whether provided to mobile number valid or not

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexdemo7 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");

        Matcher m = p.matcher(args[0]);

        if (m.find() && m.group().equals(args[0])) {
            System.out.println("Valid mobile Number");
        } else {
            System.out.println("Invalid Mobile NJumber");
        }
    }
}
