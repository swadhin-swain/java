
/*
 * 1221. Split a String in Balanced Strings

Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 */
import java.util.*;

public class Leetcode38 {
    public static int balancedStringSplit(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        stack.push('c');

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'R' && stack.peek() == 'L') {
                stack.pop();
                if (stack.size() == 1) {
                    count++;
                }
            } else if (ch == 'L' && stack.peek() == 'R') {
                stack.pop();
                if (stack.size() == 1) {
                    count++;
                }
            } else {
                stack.push(ch);
            }
        }
        return count;
    }

    // or

    public static int balancedStringSplit2(String s) {
        int balance = 0, count = 0;

        for(char ch:s.toCharArray()) {
            if (ch=='R') {
                balance++;
            }else {
                balance--;
            }
            
            if (balance==0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";

        System.out.println(balancedStringSplit2(s));
    }
}
