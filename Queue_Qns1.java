// first non repeating letter in a stream of characters
import java.util.*;

public class Queue_Qns1 {
    public static void printNonRepeating(String str) {
        int frequency[] = new int[26]; // 'a'-'z'
        Queue<Character> q = new LinkedList<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch - 'a']++;
            q.add(ch);

            while(!q.isEmpty() && frequency[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if(q.isEmpty()) {
                System.out.print(-1+" ");
            } else {
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";

        printNonRepeating(str);
    }
}

