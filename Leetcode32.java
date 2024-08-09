public class Leetcode32 {
    public static int countStudents(int[] students, int[] sandwiches) {
        int circleSandwitch = 0, squareSandwitch = 0;

        for(int choice : students) {
            if(choice == 0) {
                circleSandwitch++;
            } else {
                squareSandwitch++;
            }
        }

        for(int sandwitch : sandwiches) {
            if (sandwitch == 0 && circleSandwitch == 0) {
                return squareSandwitch;
            }
            if (sandwitch == 1 && squareSandwitch == 0) {
                return circleSandwitch;
            }
            if (sandwitch==0) {
                circleSandwitch--;
            } else {
                squareSandwitch--;
            }
        }

        return 0;
}

public static void main(String[] args) {
    int [] students = {1,1,1,0,0,1};
    int [] sandwiches = {1,0,0,0,1,1};

    System.out.println(countStudents(students, sandwiches));
}
}
