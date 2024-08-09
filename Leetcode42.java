/*
 * 1614. Maximum Nesting Depth of the Parentheses

Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

Example 1:

Input: s = "(1+(2*3)+((8)/4))+1"

Output: 3

Explanation:

Digit 8 is inside of 3 nested parentheses in the string.

Example 2:

Input: s = "(1)+((2))+(((3)))"

Output: 3

Explanation:

Digit 3 is inside of 3 nested parentheses in the string.

Example 3:

Input: s = "()(())((()()))"

Output: 3
 */

public class Leetcode42 {
    public static int maxDepth(String s) {
        int max = 0;
        int openBracket = 0;
        for(char ch: s.toCharArray()) {
            if( ch == '(') {
                openBracket++;
            }
            else if(ch == ')'){
                openBracket--;
            }
            max = Math.max(max, openBracket);
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";

        System.out.println(maxDepth(s));
    }
}
