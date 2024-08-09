import java.util.*;
public class HashMaps {
    public static void main(String[] args) {
        // create
       HashMap<String, Integer> hm = new HashMap<>();

       //Insert - O(1)
       hm.put("India", 100);
       hm.put("China", 150);
       hm.put("US", 50);

       System.out.println(hm);

       // Get - O(1)
       int population = hm.get("India");
       System.out.println(population);

       System.out.println(hm.get("Indonesia"));

       // containsKey - O(1) 
       System.out.println(hm.containsKey("India"));
       System.out.println(hm.containsKey("Indonesia"));

       //Remove -O(1)
       System.out.println(hm.remove("China"));
       System.out.println(hm);
       System.out.println(hm.remove("Indonesia"));

       //size
       System.out.println(hm.size());

       //isEmpty
       System.out.println(hm.isEmpty());

       //clear
       hm.clear();
       System.out.println(hm);
       System.out.println(hm.isEmpty());

       //Iterate on HashMap
       hm.put("India", 100);
       hm.put("China", 150);
       hm.put("US", 50);
       hm.put("Indonesia", 10);
       hm.put("Nepal", 5);
       hm.put("Italy", 7);

       Set<String> keys = hm.keySet();
       System.out.println(keys);

       for (String k : keys) {
        System.out.println("Key = "+k+", val = "+hm.get(k));
       }
    }
}
