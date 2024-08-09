
//chocola problem
import java.util.*;

public class Greedy_Qns7 {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 };// m-1
        Integer costHor[] = { 4, 1, 2 };// n-1

        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if (costHor[h] <= costVer[v]) {
                cost += costVer[v] * hp;
                vp++;
                v++;
            } else {
                cost += costHor[h] * vp;
                hp++;
                h++;
            }
        }

        while (h < costHor.length) {
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        while (v < costVer.length) {
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        System.out.println("min cost of cuts = "+cost);
    }
}
