// find the Itinerary from tickets
import java.util.*;

public class HashMap_Qns3 {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String keys : tickets.keySet()) {
            revMap.put(tickets.get(keys), keys);
        }

        for (String keys : tickets.keySet()) {
            if (!revMap.containsKey(keys)) {
                return keys; // starting point 
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print(" -> "+tickets.get(start));
            start = tickets.get(start);
        }
    }
}
