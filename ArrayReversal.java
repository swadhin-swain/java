import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReversal {
    public static void reverseArray(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        
        reverseArray(array);
        
        System.out.println("\nReversed Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
