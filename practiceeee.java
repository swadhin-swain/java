import java.util.HashSet;

/**
 * practiceeee
 */
public class practiceeee {

    public static void main(String[] args) {
        int arr1[] = {1,2,4,7,9};
        int[] arr2 = {1,3,4,8,9};

        HashSet<Integer> s = new HashSet<>();

        for(int i=0;i<arr1.length;i++) {
            s.add(arr1[i]);
        }

        int present =0;
        for(int i=0;i<arr2.length;i++) {
            if(s.contains(arr2[i])) {
                present++;
            }
        }

        System.out.println("present element is "+present);
    }
}