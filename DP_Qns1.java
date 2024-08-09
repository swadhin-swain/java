//climbing stairs

public class DP_Qns1 {
    // recursion
    public static int ways(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return ways(n - 1) + ways(n - 2);
    }

    // memoization
    public static int waysMemoization(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != 0) {
            return ways[n];
        }
        ways[n] = waysMemoization(n - 1, ways) + waysMemoization(n - 2, ways);

        return ways[n];
    }

    // Tabulation
    public static int waysTabulation(int n) {
        int ways[] = new int[n + 1];
        ways[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                ways[1] = 1;
            } else {
                ways[i] = ways[i - 1] + ways[i - 2];
            }
        }

        return ways[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(ways(n));
        int ways[] = new int[n + 1];
        System.out.println(waysMemoization(n, ways));
        System.out.println(waysTabulation(n));
    }
}
