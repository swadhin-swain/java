
// Duplicate Parentheses
import java.util.*;

public class Stack_Qns7 {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            if (ch == ')') {// closing
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    return true; // duplicates
                } else {
                    s.pop(); // opening pair
                }
            } else {
                s.push(ch); // opening
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))";
        String str2 = "(a+b)";

        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
