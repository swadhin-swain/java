import java.util.*;
public class Arraylist {
   public static void main(String[] args) {
    ArrayList<Integer> L1=new ArrayList<>();
    ArrayList<Integer> L2=new ArrayList<>(5);
    L1.add(23);
    L1.add(33);
    L1.add(43);
    L1.add(53);
    L1.add(63);
    L1.add(73);
    L1.add(53);
    L1.add(93);
    L1.add(0,24);
    L1.add(01,56);
    L2.add(3);
    L2.add(4);
    L2.add(8);
    L2.add(4);
    L2.add(0);
    L2.add(7);
    L1.addAll(0,L2);
    L1.set(1,566);//set a element in in which index you want
    System.out.println("The index of 33 is "+L1.indexOf(33));
    System.out.println("The last index of 53 is "+L1.indexOf(53));
    System.out.println("The index of 53 is "+L1.lastIndexOf(53));
    System.out.println(L1.contains(29));
    //L1.clear();//--->clear the all element in arraylist
    for(int i=0;i<L1.size();i++){
        System.out.print(L1.get(i));
         System.out.print(", ");
    }
    System.out.println(L1.isEmpty());
   } 
}
