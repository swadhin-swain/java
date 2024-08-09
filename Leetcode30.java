/*
 735. Asteroid Collision

We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

 

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.
Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
 */

import java.util.*;

public class Leetcode30 {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<asteroids.length;i++) {
            // if stack is empty or a positive value arrives then perform a blind inserion
            if (s.isEmpty() || asteroids[i] > 0) {
                s.push(asteroids[i]);
            } else { // for negative asteroids
                while (!s.isEmpty()) {
                    int top = s.peek();

                    // if the top is negative and the comming asteroid is also negative
                    if (top < 0) {
                        s.push(asteroids[i]);
                    }

                    int modVal = Math.abs(asteroids[i]);
                    
                    // if the top is positive or coming asteroid is negatiove and both ha same weight
                    if (top == modVal) {
                        s.pop();
                        break;
                    } else if (modVal < top) { //if the top is positive or coming asteroid is negatiove and top value has more weight
                        break;
                    } else {
                        s.pop();
                        if (s.isEmpty()) { //if the top is positive or coming asteroid is negatiove and incoming asteroid has more weight
                            s.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }

        int ans[] = new int[s.size()];
        for(int i = ans.length-1;i>=0;i--){
            ans[i] = s.pop();
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] asteroids = {10,2,-5,4,-10,20,30,-40,40};

        int ans[] = asteroidCollision(asteroids);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
