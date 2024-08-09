public class Var_Args {
    static int sum(int...arr){
        int result=0;
        for(int element:arr){
            result=result+element;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("the sum of 2 & 3 is "+sum(2,3));
         System.out.println("the sum of 2 & 3 & 5 is "+sum(2,3,5));
          System.out.println("the sum is "+sum());
    }
}
