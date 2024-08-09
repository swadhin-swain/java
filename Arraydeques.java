
    
    import java.util.*;
    public class Arraydeques{
       public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        // ad1.addLast(5);
        // ad1.offerFirst(10);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());
        System.out.println(ad1);
        ad1.pollFirst();//delete 6
        ad1.removeFirst();//delete 56
        System.out.println(ad1);
        ad1.pollLast();//delete 19
        ad1.removeLast();//delete 91
         System.out.println(ad1);
          System.out.println(ad1.getFirst());System.out.println(ad1.getLast());
       } 
    }
