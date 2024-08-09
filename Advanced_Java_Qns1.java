
//create an arraylist and stores name of 10 students inside it print it using a for each loop.
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Advanced_Java_Qns1 {
    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<>();
        st.add("Swadhin");
        st.add("Abhijit");
        st.add("Himanshu");
        st.add("Pabitra");
        st.add("Ranjit");
        st.add("Kanha");
        st.add("Omm Prakash");
        st.add("Anand");
        st.add("Chinu");
        st.add("Adarsh");

        for (String element : st) {
            System.out.println(element);
        }

        //
        HashSet s = new HashSet<>();
        s.add(60);
        s.add(6);
        s.add(40);
        s.add(9);
        s.add(60);
        System.out.println(s);

        //
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        //
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        //
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern(" H:m:s"); // This is the format
        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);
    }
}
