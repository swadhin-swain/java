public class practiceeee {
    public static int canCompleteCircuit(int[] gas, int[] cost)  {
        int validFuel=0;
        int n = gas.length;

        for(int i=0;i<n;i++) {
            if(gas[i] >= cost[i]) {
                int j=i;
                validFuel+=gas[j];
                while (j!=i-1) {
                    if (validFuel-cost[j] >=0) {
                        validFuel = (validFuel-cost[j]) + gas[(j+1)%n];
                        j=(j+1)%n;
                    }
                }
                if(validFuel>=cost[j]) {
                    return j+1;
                }
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int [] gas = {2,3,4}, cost = {3,4,3};
       System.out.println(canCompleteCircuit(gas, cost));
    }
}