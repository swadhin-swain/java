import java.util.*;

public class Hashsets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(6, 0.5f);
        set.add(3);
        set.add(6);
        set.add(2);
        set.add(11);
        set.add(11);
        System.out.println(set);

        if (set.contains(2)) {
            System.out.println("set contains");
        }

        set.remove(2);

        System.out.println(set.size());

        set.clear();
        System.out.println(set.isEmpty());

        System.out.println(set.clone());// this method create a clone of hashset.

        HashSet<String> cities= new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Chennai");
        cities.add("Hyderabad");

        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); 
        }

        for (String city : cities) {
            System.out.println(city);
        }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Chennai");
        lhs.add("Hyderabad");

        System.out.println(cities);
        System.out.println(lhs);

        lhs.remove("Delhi");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Chennai");
        ts.add("Hyderabad");
        System.out.println(ts);

    }
}
