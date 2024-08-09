import java.util.*;

public class Deques {
    public static void main(String[] args) {
        Deque<Integer> d = new  LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addLast(3);
        d.addLast(4);
        
        System.out.println(d);

        d.removeFirst();
        System.out.println(d);

        d.removeLast();
        System.out.println(d);

        System.out.println("first element is "+d.getFirst());
        System.out.println("last element is "+d.getLast());
    }
}
