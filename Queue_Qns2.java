
// Interleave 2 halves of a queue
import java.util.*;

public class Queue_Qns2 {
    public static void interleaveOfQueue(Queue<Integer> q) {
        int size = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();
 
        for (int i = 0; i < size / 2; i++) { // putting first part in another Queue
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        interleaveOfQueue(q);

        // print the Interleave queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
