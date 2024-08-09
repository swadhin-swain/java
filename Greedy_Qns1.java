
// Activity selection
import java.util.*;

public class Greedy_Qns1 {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 }; // end time basis sorted

        // sorting
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxActivity = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            // activity select
            if (activities[i][1] >= lastEnd) {
                ans.add(activities[i][0]);
                maxActivity++;
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maximum number of activity is " + maxActivity);
        for (int i = 0; i < ans.size(); i++) {
            System.err.print("A" + ans.get(i) + " ");
        }
    }
}
