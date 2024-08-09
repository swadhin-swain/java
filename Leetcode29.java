/*
 Baseball Game

You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x.
Record a new score of x.
'+'.
Record a new score that is the sum of the previous two scores.
'D'.
Record a new score that is the double of the previous score.
'C'.
Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

 

Example 1:

Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.
leetcode qns no - 682
 */

import java.util.*;

public class Leetcode29 {
    public static int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                s.push(s.peek() + s.get(s.size() - 2));
            } else if (op.equals("D")) {
                s.push(2 * s.peek());
            } else if (op.equals("C")) {
                s.pop();
            } else {
                s.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : s) {
            sum += score;
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] operations = { "5", "2", "C", "D", "+" };
        System.out.println(calPoints(operations));
    }
}
