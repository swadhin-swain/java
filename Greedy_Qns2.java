//Fractional knapsack

import java.util.*;

public class Greedy_Qns2 {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col for index & 1th col for ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // ascendind ordersorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int maxval = 0;
        int capacity = w;

        // we want descending order sorting. That's why
        for (int i = ratio.length - 1; i >= 0; i--) {
            int index = (int) ratio[i][0];
            if (capacity >= weight[index]) {// including full item
                maxval = maxval + val[index];
                capacity = capacity - weight[index];
            } else {
                // include fractional item
                maxval += capacity * ratio[i][1];
                capacity = 0;
            }
        }

        System.out.println("max value is " + maxval);
    }
}
