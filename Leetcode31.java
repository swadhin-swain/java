/*
921. Minimum Add to Make Parentheses Valid

A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

Example 1:

Input: s = "())"
Output: 1
Example 2:

Input: s = "((("
Output: 3
 */

import java.util.Stack;

public class Leetcode31 {
    public static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i< s.length();i++) {
            char c = s.charAt(i);
             
             if(c == '(') { // if open parenthesis coming blindly push into stack
                st.push(c);
             } else {
                if(st.isEmpty() || st.peek() == ')') { // if closing parenthesis coming and stack is empty or top of a stack is a closing parenthesis then push the closing parenthesis into stack
                    st.push(c);
                } else { // if closing parenthesis coming and stack is not empty or top of a stack is not a closing parenthesis then pop the top of the stack
                    st.pop();
                }
             }
        }
        return st.size();
    } 

    // another approach
    public static int minAddToMakeValid2(String s) {
        int open = 0, close = 0;

        for(int i=0;i< s.length();i++) {
            char c = s.charAt(i);
             
             if(c == '(') { // if open parenthesis coming then increase the value of open by one
                open++;
             } else {
                if(open <= 0) { // if a closing bracket coming and there is no open bracket then increase the value of close by one
                    close++;
                } else { // if a closing bracket coming and there is open bracket available then decrease the value of open by one
                    open--;
                }
             }
        }

        return open + close;
    }
    
    public static void main(String[] args) {
        String s = "(((";

        System.out.println(minAddToMakeValid(s));
    }
}
