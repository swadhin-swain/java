
// Max Area in Histogram
import java.util.*;

public class Stack_Qns8 {
    public static int maxArea(int[] arr) {
        int[] nsl = new int[arr.length];
        int[] nsr = new int[arr.length];
        int maxArea = 0;
        
        // calculate the next smaller right -> O(n)
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s .isEmpty()){
                nsr[i] = arr.length;
            }
            else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // calculate the next smaller left -> O(n)
        s = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = arr.length;
            }
            else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // find the area -> O(n)
        for(int i =0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};

        System.out.println("The max area in histogram = "+maxArea(arr));
        // tc -> O(n)
    }
}
