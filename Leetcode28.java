/*
 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

 

Example 1:

Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

leetcode qns no - 1021
 */

public class Leetcode28 {
    public static String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ')') {
                count--;
            }
            if (count != 0) {
                str.append(ch);
            }

            if (ch == '(') {
                count++;
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        String ss = removeOuterParentheses(s);

        for (int i = 0; i < ss.length(); i++) {
            System.out.print(ss.charAt(i));
        }
    }
}
